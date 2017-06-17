package home.study;

public class Date {
	
	public void date(Woman woman, Man man){
		woman.setJewelry(man.getJewelry());
		man.setJewelry(null);
		System.out.println(man.getName()+" and "+woman.getName()+" have a date");
		System.out.println(man.getName()+" gave "+woman.getName()+" "+woman.getJewelry().getPrice()+"$ expensive jewelry");
		man.getJewelry();
		
	}
}
