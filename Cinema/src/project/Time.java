package project;

public class Time implements Comparable<Time>{
	private int minute;
	private int hour;
	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
		
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0&&minute<60){
			this.minute = minute;;
			}else{
				System.out.println("The hour has only 60 minutes!");
			}
		
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour>=0&&hour<24){
		this.hour = hour;
		}else{
			System.out.println("The day has only 24 hours!");
		}
	}
	@Override
	public String toString() {
		return "Time: " + hour + " hours " + minute + " minutes " + "\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	@Override
	public int compareTo(Time oTime) {
		if(this.hour>oTime.getHour()){
			return 1;
		}else if(this.hour<oTime.getHour()){
			return -1;
		}else if(this.minute>oTime.getMinute()){
			return 1;
		}else if (this.minute<oTime.getMinute()){
			return -1;
		}else{
		return 0;
		}
	}
	
	
	
	
	
	
//	public void startTime(){
//		System.out.println("Enter hour");
//		int userHour = Main.scanner.nextInt();
//		if(Main.scanner.hasNextInt()){
//			if(userHour>0&&userHour<24){
//				hour=userHour;
//			}else{
//				System.out.println("Wrong time.");
//			}
//		}
//		System.out.println("Enter minutes");
//		int userMinutes = Main.scanner.nextInt();
//		if(Main.scanner.hasNextInt()){
//			if(userMinutes>0&&userMinutes<60){
//				minute=userMinutes;
//			}else{
//				System.out.println("Wrong time.");
//			}
//		}
//	}
}
