package ua.home;

public class WorkerHour implements Salary{
	private String name;
	private int hourSalary;
	private int workedHour;
	


	public WorkerHour(String name, int hourSalary, int workedHour) {
		super();
		this.name = name;
		this.hourSalary = hourSalary;
		this.workedHour = workedHour;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHourSalary() {
		return hourSalary;
	}



	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}



	public int getWorkedHour() {
		return workedHour;
	}



	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}



	@Override
	public void salary() {
		int sum = hourSalary*workedHour;
		System.out.println(name+" received "+sum+"$ per month");
	}
	
}
