package ua.study;

public class Main {

	public static void main(String[] args) {
		Transport transport = Transport.PLANE;
		System.out.println(transport);
		System.out.println(transport.name().length());
		System.out.println(transport.HORSE.ordinal());//ordinal виводить позицію в списку констант enum, йде від 0
		Transport [] transports = transport.values();
		for (int i = 0; i < transports.length; i++) {
			System.out.println(transports[i]);
		}
//		int max=0;
//		String name = "";
//		for (int i = 0; i < transports.length; i++) {
//			
//			if(transports[i].getMaxSpeed()>max){
//				max = transports[i].getMaxSpeed();
//				name = transports[i].name();
//			}	
//		}
//		System.out.println(name+" has max speed "+max);
		
		Transport current = transport.values()[0];
		for (int i = 0; i < transports.length; i++) {
			if(current.getMaxSpeed()<transports[i].getMaxSpeed()){
				current = transports[i];
			}
		}
		System.out.println(current.name()+" "+current.getMaxSpeed());
		
		int sumPassengers = 0;
		for (int i = 0; i < transports.length; i++) {
			sumPassengers = sumPassengers + transports[i].getMaxPassengers();
		}
		System.out.println("sum = "+sumPassengers);
		
		
	}

}
