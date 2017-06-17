package ua.study;

public class Godzilla extends Monster implements CrushAll, DestroyAll{

	@Override
	public void scarePeople() {
		System.out.println("Godzilla scare people");
		
	}

	@Override
	public void destroy() {
		System.out.println("Godzilla destroy all");
		
	}

	@Override
	public void crush() {
		System.out.println("Godzilla crush all");
		
	}
	
	
}
