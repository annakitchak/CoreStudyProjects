package project;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		TreeMap<Days, Schedule> cinemaSchedule = null;
		Cinema cinema = new Cinema(cinemaSchedule, new Time(10, 0), new Time(2, 30));
		cinema.start();
	}

}
