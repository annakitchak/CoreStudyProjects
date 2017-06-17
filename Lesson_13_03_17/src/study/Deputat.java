package study;

public class Deputat extends Human{
	private String firstName;
	private String LastName;
	private int age;
	private boolean habarnyk;
	private int habarSize;
	public Deputat(int weight, int height, String firstName, String lastName, int age, boolean habarnyk) {
		super(weight, height);
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
		this.habarnyk = habarnyk;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHabarnyk() {
		return habarnyk;
	}
	public void setHabarnyk(boolean habarnyk) {
		this.habarnyk = habarnyk;
	}
	public int getHabarSize() {
		return habarSize;
	}
	public void setHabarSize(int habarSize) {
		this.habarSize = habarSize;
	}
	
	public void givaHabar(){
		
		if(habarnyk==false){
			System.out.println("Цей депутат не бере хабарів");
		}else{
			System.out.println("Введіть суму хабаря");
			int user = Main.scanner.nextInt();
			if(user>5000){
				System.out.println("Поліція ув'язнить депутата");
			}else{
				habarSize=user;
			}
		}
	}
}
