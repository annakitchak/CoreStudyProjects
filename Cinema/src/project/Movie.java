package project;

public class Movie {
	private String title;
	private int timeDuration;
	public Movie(String title, int timeDuration) {
		super();
		this.title = title;
		this.timeDuration = timeDuration;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTimeDuration() {
		return timeDuration;
	}
	public void setTimeDuration(int timeDuration) {
		this.timeDuration = timeDuration;
	}
	@Override
	public String toString() {
		return "Movie title: " + title + ", timeDuration " + timeDuration + " minutes " + "\n";
	}
	
}
