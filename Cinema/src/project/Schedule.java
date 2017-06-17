package project;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	private Set<Seance> seances;

	public Schedule() {
		super();
		this.seances = new TreeSet<Seance>();
	}

	public Set<Seance> getSchedule() {
		return seances;
	}

	public void setSchedule(Set<Seance> seances) {
		this.seances = seances;
	}

	@Override
	public String toString() {
		return "Schedule: " + seances + "\n";
	}
	
	public void addSeance(){
		System.out.println("Enter movie title");
		String title = Main.scanner.next();
		System.out.println("Enter time duration");
		int duration = Main.scanner.nextInt();
		System.out.println("Enter start time:");
		System.out.println("Enter hour");
		int hour = Main.scanner.nextInt();
		System.out.println("Enter minutes");
		int minutes = Main.scanner.nextInt();
		Time startTime = new Time(hour, minutes);
		Seance seance = new Seance(new Movie(title, duration), startTime);
		seance.setEndTime(startTime);
		seances.add(seance);
		for (Seance s : seances) {
			System.out.println(s);
		}
//		Iterator<Seance> iterator = seances.iterator();
//		while(iterator.hasNext()){
//		System.out.println(seances);
//		}
		
		
		
	}
	
	public void removeSeance(){
		
	}

	


	
}
