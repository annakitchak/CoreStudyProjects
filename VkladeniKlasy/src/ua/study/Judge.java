package ua.study;

public class Judge implements OuterClass.InnerInterface{
	private String name;
	public static class Punishment{
		public void inStaticClassMethod(){
			System.out.println("in static class");
			Judge judge = new Judge();
			judge.name = "John";
		}
		
		public static class Prison{
			
		}
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	
}
