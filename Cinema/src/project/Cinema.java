package project;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import project.Days;

public class Cinema {
	private static Cinema cinema;
	private static TreeMap<Days,Schedule> schedule;
	private Time open;
	private Time close;
	
	//private Set<Seance> seances;
	 public static Cinema getInstance(){
	        if(cinema == null){
	            cinema = new Cinema(schedule, new Time(10, 0), new Time(2, 30)); // 10:00-02:30
	        }
	        return cinema;
	    }
	public Cinema(TreeMap<Days, Schedule> cinemaSchedule, Time open, Time close) {
		super();
		this.schedule = new TreeMap<Days,Schedule>();
		this.open = open;
		this.close = close;
	}
	public Cinema() {
		// TODO Auto-generated constructor stub
	}
	public TreeMap<Days, Schedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(TreeMap<Days, Schedule> schedule) {
		this.schedule = schedule;
	}
	public Time getOpen() {
		return open;
	}
	public void setOpen(Time open) {
		this.open = open;
	}
	public Time getClose() {
		return close;
	}
	public void setClose(Time close) {
		this.close = close;
	}
	@Override
	public String toString() {
		return "Cinema : " + schedule + ", open=" + open + ", close=" + close + " ";
	}
	
	
	public void showScheduleForChosenDay(){
		boolean exist = false;
		String usr = "";
	    do{ 
	    	System.out.println("Enter day.");
			usr = Main.scanner.next();
			Days [] days = Days.values();
			for (int i = 0; i < days.length; i++) {
				if(usr.toUpperCase().equals(days[i].name())){
					exist = true;
					if(schedule.isEmpty()){
						System.out.println("Dont have schedule for this day.");
					}else{
						//System.out.println(schedule.values());
						
						Set <Entry<Days, Schedule>> set = schedule.entrySet();
						for (Entry<Days, Schedule> entry : set) {
							
							System.out.println(entry.getValue());
						}
					}
					break;
				}
				}
			if(exist==false){
				System.out.println("Wrong input! Try again.");
			}}while(!exist==true);
	}
	
	
	public void addMovie(){
		//boolean addMov = false;
//		System.out.println("Enter movie title.");
//		String movieTitle = Main.scanner.next();
//		if(cinema.getSchedule().containsValue(movieTitle)){
//			System.out.println("This movie already exist.");
//		}else{
//			System.out.println("Enter time duration.");
//			int time = Main.scanner.nextInt();
			//Movie movie = new Movie(movieTitle, time);
			//Seance seance = new Seance(movie, new Time(11, 25));
		schedule.put(Days.SUNDAY, new Schedule());
		schedule.put(Days.MONDAY, new Schedule());
		schedule.put(Days.TUESDAY, new Schedule());
		schedule.put(Days.WEDNESDAY, new Schedule());
		schedule.put(Days.TUESDAY, new Schedule());
		schedule.put(Days.FRIDAY, new Schedule());
		schedule.put(Days.SATURDAY, new Schedule());
			System.out.println("Enter day.");
			String day = Main.scanner.next();
			Days [] days = Days.values();
			for (int i = 0; i < days.length; i++) {
				if(day.equalsIgnoreCase(days[i].name())){
					//schedule.keySet().add(days[i]);
					schedule.get(days[i]).addSeance();
					
				}else{
					System.out.println("This day doesn't exist! Try again.");//винести за  цикл
				}
			}
//				if(day.toUpperCase().equals("MONDAY")){
//					schedule.put(Days.MONDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("TUESDAY")){
//					schedule.put(Days.TUESDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("WEDNESDAY")){
//					schedule.put(Days.WEDNESDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("THURSDAY")){
//					schedule.put(Days.THURSDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("FRIDAY")){
//					schedule.put(Days.FRIDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("SATURDAY")){
//					schedule.put(Days.SATURDAY, new Schedule(new TreeSet<Seance>()));
//				}else if(day.toUpperCase().equals("SUNDAY")){
//					schedule.put(Days.SUNDAY, new Schedule(new TreeSet<Seance>()));
//				}else{
//					System.out.println("This day doesn't exist! Try again.");
//				}
			
//			Set <Entry<Days, Schedule>> set = schedule.entrySet();
//			for (Entry<Days, Schedule> entry : set) {
//				entry.getValue().addSeance();
//			}
			//addMov=true;
		}
	//}
	
	public void addSeance(){
		
	}
	
	public void removeMovie(){
		
	}
	
	public void removeSeance(){
		
	}
	
	
	
	
	
	
	public void start() throws IOException{
//		Cinema cinema = new Cinema(cinemaSchedule, new Time(10, 0), new Time(2, 30)); // 10:00-02:30
		Scanner scanner = new Scanner(System.in);
		File file = new File("cinema.txt");
		file.createNewFile();
		String user ="";
		do{
		System.out.println("_______________________________________");
		System.out.println("Press 1 to show schedule for chosen day.");
		System.out.println("Press 2 to find a movie for chosen day.");
		System.out.println("Press 3 to find a movie.");
		System.out.println("Press 4 to add movie.");
		System.out.println("Press 5 to remove movie.");
		System.out.println("Press 6 to add seance.");
		System.out.println("Press 7 to remove seance.");
		System.out.println("Press 8 to exit");
		System.out.println("_______________________________________");
		user = scanner.next();
		switch(user){
		case "1":{
			showScheduleForChosenDay();
			break;
		}
		case "2":{
			break;
		}
		case "3":{
			break;
		}
		case "4":{
			addMovie();
			break;
		}
		case "5":{
			break;
		}
		case "6":{
			boolean exist = false;
	    do{ 
	    	System.out.println("Enter day.");
			user = scanner.next();
			Days [] days = Days.values();
			for (int i = 0; i < days.length; i++) {
				if(user.toUpperCase().equals(days[i].name())){
					exist = true;
					System.out.println(days[i].name());
					
					break;
				}
				}
			if(exist==false){
				System.out.println("Wrong input! Try again.");
			}}while(!exist==true);
			break;
		}
		case "7":{
			break;
		}
		case "8":{
			System.exit(0);
			break;
		}
		}
		}while(!user.equals("8"));
		
	}
}
