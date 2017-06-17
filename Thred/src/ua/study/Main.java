package ua.study;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.currentThread().getName());
//		MyThread myThread = new MyThread();
//		myThread.start();
		
		
//		myThread.join();//наступний пот≥к запуститьс€,коли завершитьс€ перший пот≥к, 
//		MyThread myThread1 = new MyThread();
//		myThread1.start();
		
//		MyRunnable myRunnable = new MyRunnable();
//		Thread thread = new Thread(myRunnable);
//		thread.start();
		
//		Thread thread = new Thread(new MyRunnable());
//		thread.start();
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("annonimus thread");
//				
//			}
//		});
//		thread.start();
		
//		static int counter = 0;
//		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//		service.scheduleAtFixedRate(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("value = "+counter);
//				counter++;
//				if(counter == 5){
//					service.shutdown();
//				}
//			}
//		}, 3, 1, TimeUnit.SECONDS);
		
		
		
//«ј¬ƒјЌЌя:  ¬ивести введену з клав≥атури к-сть чисел ф≥бонач≥
		
		
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int a = 0;
		
//		for (int i = 1; i < 100; i++) {
//			a=a+i;
//			
//			System.out.print(a+" ");
//		}
//		
		
		
//		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//		service.scheduleAtFixedRate(new Runnable() {
//			int counter = 0;
//			@Override
//			public void run() {
//				System.out.println("value = "+counter);
//				
//				counter++;
//				if(counter == user){
//					service.shutdown();
//				}
//			}
//		}, 3, 1, TimeUnit.SECONDS);
		
		
	}

}
