package ua.lviv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1 2 5 10 25 50
		 * 115
		 * 50-2
		 * 10-1
		 * 5-1
		 * int a = 115%50=15
		 * int b =15%25
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int user = scanner.nextInt();
		int a, a1 = 0;
		int b, b1 = 0;
		int c, c1 = 0;
		int d, d1 = 0;
		int e, e1 = 0;
		int f, f1 = 0;
		boolean t1 = false, t2 = false, t3 = false, t4 = false, t5 = false, t6 = false;
		if(user>=50){
		a = user%50;
		a1 = (user-a)/50;
		t1=true;
		}else{
			a=user;
		}
		if(a>=25){
			b = a%25;
			b1 = (a-b)/25;
			t2=true;
		}else{
			b=a;
		}
		if(b>=10){
			c = b%10;
			c1 = (b-c)/10;
			t3=true;
		}else{
			c=b;
		}
		if(c>=5){
			d = c%5;
			d1 = (c-d)/5;
			t4=true;
		}else{
			d=c;
		}
		if(d>=2){
			e = d%2;
			e1 = (d-e)/2;
			t5=true;
		}else{
			e=d;
		}
		if(e>=1){
			f = a%1;
			f1 = (e-f)/1;
			t6=true;
		}else{
			f=e;
		}
		System.out.println("You need:");
		if(t1==true){
		System.out.println(" 50 - "+a1);
		}
		if(t2==true){
		System.out.println(" 25 - "+b1);
		}
		if(t3==true){
		System.out.println(" 10 - "+c1);
		}
		if(t4==true){
		System.out.println(" 5 - "+d1);
		}
		if(t5==true){
		System.out.println(" 2 - "+e1);
		}
		if(t6==true){
		System.out.println(" 1 - "+f1);
		}
		
	}

}
