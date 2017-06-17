package home.study;

public class Woman {
	private String name;
	private Job job;
	private Jewelry jewelry;
	private Man man;
	public Woman(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Jewelry getJewelry() {
		return jewelry;
	}
	public void setJewelry(Jewelry jewelry) {
		this.jewelry = jewelry;
	}
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	
}
