
public class Pet {
int age;
float weight;
float height;
String color;
public void sleep(){
	System.out.println("Good Night");
}
public void eat(){
	System.out.println("I'm hungry");
}
public String say(String aWord){
	String petResponse = "Ok, " +aWord;
	return petResponse;
}
}
