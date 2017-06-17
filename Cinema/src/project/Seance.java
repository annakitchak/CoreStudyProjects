package project;

public class Seance implements Comparable<Seance>{
	private Movie movie;
	private Time startTime;
	private Time endTime;
	public Seance(Movie movie, Time startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		int minutes = 0;;
		int hours = 0;
		if(movie.getTimeDuration()>59){
			hours = movie.getTimeDuration()/60 + startTime.getHour();
			minutes = movie.getTimeDuration()%60 + startTime.getMinute();
			if(minutes>60){
				minutes=minutes-60;
				hours=hours+1;
			}
		}
		this.endTime = new Time(hours, minutes);
		//Time endTime = new Time(hours, minutes);
		// this.endTime= endTime;
	}
	@Override
	public String toString() {
		return "Seance movie: " + movie.getTitle() + ", startTime - " + startTime + ", endTime - " + endTime + "\n";
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		Seance other = (Seance) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	@Override
	public int compareTo(Seance oSeance) {  //метод для сортування
		if(this.startTime.getHour()>oSeance.getStartTime().getHour()){
			return 1;
		}else if(this.startTime.getHour()<oSeance.getStartTime().getHour()){
			return -1;
		}else if(this.startTime.getMinute()>oSeance.getStartTime().getMinute()){
			return 1;
		}else if (this.startTime.getMinute()<oSeance.getStartTime().getMinute()){
			return -1;
		}else{
		return 0;
		}

	}
	
	
}
