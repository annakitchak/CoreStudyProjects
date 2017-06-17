package ua.home;

public class WorkerMounth implements Salary{
	private String name;
	private int monthSalary;
	
	public WorkerMounth(String name, int monthSalary) {
		super();
		this.name = name;
		this.monthSalary = monthSalary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public void salary() {
		System.out.println(name+" received "+monthSalary+"$ per month");
		
	}
	
}
