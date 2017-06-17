package home.study;

public class Main {

	public static void main(String[] args) {
		Man man = new Man("Justin", 1500);
		Job job = new Job("driver", 7000);
		System.out.println(man.getName()+" have "+man.getMoney()+"$");
		man.setJob(job);
		System.out.println("Now "+man.getName()+" get a job and have "+man.getMoney()+"$");
		Jewelry jewelry = new Jewelry(700);
		man.setJewelry(jewelry);
		System.out.println(man.getName()+" buy "+man.getJewelry().getPrice()+"$ expensive jewelry");
		System.out.println("Now "+man.getName()+" have "+man.getMoney()+"$");
		Woman woman = new Woman("Emily");
		Date date = new Date();
		date.date(woman, man);
		

	}

}
