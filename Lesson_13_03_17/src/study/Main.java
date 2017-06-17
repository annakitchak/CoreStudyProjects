package study;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Scanner;

public class Main {

 static	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Frakcia frakcia = new Frakcia();
		frakcia.addDeputat();
		frakcia.addDeputat();
		System.out.println(frakcia);
	}

}
