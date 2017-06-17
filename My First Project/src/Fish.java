
public class Fish extends Pet {
	int currentDepth=0;
	 public int dive(int howDeep){
	 currentDepth=currentDepth + howDeep;
	 if(currentDepth>100){
		 System.out.println("I'm a little fish"+" and I can't swim deepest 100 meters");
		 currentDepth=currentDepth-howDeep;
	 }
	 else{
		 System.out.println("Swim "+howDeep+" meters deeper!");
		 System.out.println("I'm in "+currentDepth+" meters deep!");
	 }
	 return currentDepth;
	 }
	 public String say(String something){
		 return "Fish can't talk!";
		 }
}
