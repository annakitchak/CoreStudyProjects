package ua.study;

public enum Transport {
	BUS(60,70), TRAIN(120,80), TRAM(200,40), PLANE(863,1000), BOAT(1300,50), CAR(6,200), HORSE(2,59);
	
	private int maxPassengers;
	private int maxSpeed;
	private Transport(int maxPassengers, int maxSpeed) {
		this.maxPassengers = maxPassengers;
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
