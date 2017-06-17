package ua.study;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
	//	file.createNewFile();
	//	file.mkdirs(); створює нову папку 
		
//		FileOutputStream fileOutputStream = new FileOutputStream(file, true);
////		for (int i = 0; i < 1000; i++) {
////			fileOutputStream.write(i);
////		}
//		fileOutputStream.write("some text\n".getBytes());
//		fileOutputStream.close();
		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		//System.out.println(fileInputStream.read());
//		int temp;
//		while((temp = fileInputStream.read()) != -1){
//			System.out.print(Character.toChars(temp));
//		}
		
//		File from = new File("from.txt");
//		File to = new File("to.txt");
//		from.createNewFile();
//		to.createNewFile();
//		
//		FileInputStream fileInputStream = new FileInputStream(from);
//		FileOutputStream fileOutputStream = new FileOutputStream(to);
//		int temp;
//		while((temp = fileInputStream.read()) != -1){
//			fileOutputStream.write(temp);
//		}
//		fileInputStream.close();
//		fileOutputStream.close();
		
//		FileWriter fileWriter = new FileWriter(file);
//		fileWriter.write("asdfas");
//		fileWriter.flush();
//		fileWriter.close();
		
//		FileReader fileReader = new FileReader(file);
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		String tmp;
//		while((tmp = bufferedReader.readLine()) != null){
//		System.out.println(tmp);
//		}
		
		String url = "http://cdn.playbuzz.com/cdn/925704be-9b8e-4dfc-852e-f24d720cb9c5/a6c64b24-9336-419c-a618-ea280cfb12c4_560_420.jpg";
		String fileName = "picture.png";
		BufferedImage img = ImageIO.read(new URL(url));
		File pic = new File(fileName);
		pic.createNewFile();
		ImageIO.write(img, "png", pic );
	}

}
