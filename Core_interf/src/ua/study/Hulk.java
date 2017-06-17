package ua.study;

public class Hulk extends Monster implements CrushAll, DestroyAll {

	@Override
	public void scarePeople() {
		System.out.println("Hulk scare people");
		
	}

	@Override
	public void destroy() {
		System.out.println("Hulk destroy all");
		
	}

	@Override
	public void crush() {
		System.out.println("Hulk crush all");
		
	}
	
	
}
