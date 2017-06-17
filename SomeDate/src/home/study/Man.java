package home.study;

public class Man {
	private String name;
	private int money;
	private Job job;
	private Jewelry jewelry;
	public Man(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		if(job!=null){
			money=money+job.getPayment();
		}
		this.job = job;
	}
	public Jewelry getJewelry() {
		if(jewelry==null){
			System.out.println("You don't have any jewelry");
		}
			return jewelry;		
	}
	public void setJewelry(Jewelry jewelry) {
		if(jewelry!=null){
			money=money-jewelry.getPrice();
		}
		this.jewelry = jewelry;
	}
	
}
