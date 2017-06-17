import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {
	public void one() throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream("text.txt");
	}
	
	public void two() throws FileNotFoundException{
		one();
	}
	public void three() throws FileNotFoundException{
		two();
	}
}
