package ua.home;

public class Main {

	public static void main(String[] args) {
		WorkerMounth mounth = new WorkerMounth("Jeremy", 5000);
		WorkerHour hour = new WorkerHour("Harry", 23, 200);
		mounth.salary();
		hour.salary();
	}

}
