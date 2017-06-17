
public class CarOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		JamesBondCar BondCar=new JamesBondCar();
		myCar.start();
		myCar.stop();
		int road;
		road=myCar.drive(20);
		System.out.println("Your distance = " +road+"km");
		road=BondCar.drive(20);
		System.out.println("Bond's distance = " +road+"km... Бонд пакує)");		
	}

}
