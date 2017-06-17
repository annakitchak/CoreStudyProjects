import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) throws Exception {
//	int [] mass = new int [5];
//	System.out.println("enter some index.");
//	try{
//		mass[scanner.nextInt()]=10;
//		System.out.println("in try block");
//	}
//	catch(ArrayIndexOutOfBoundsException e){
//		System.out.println("Array exception.");
//	}catch (InputMismatchException e) {
//		System.out.println("Wrong type");
//	}
	
//	MyException myException = new MyException();
//	myException.three();
	
	
	User user = new User("lambod", "asdf");
	UserValidator userValidator = new UserValidator();
	userValidator.validate(user);
	
	
	
	
}
}
