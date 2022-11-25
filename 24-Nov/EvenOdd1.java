package Lab.java;

/*Problem code 2:
Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print */
class Even extends Thread {
	public void run() {
		System.out.println("even numbers of 1 to 100 are : ");
		for(int i=1;i<=100;i++) {
			if(i%2 ==0) {
				System.out.print(i+",");
				}
			}
   }
  }

public class EvenOdd1 extends Thread {
	public void run() {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("wait for odd : ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=100;i++) {
			if(i%2 !=0) {
				System.out.print(i+",");
			}
		}
	}
public static void main(String[] args) {
	Even t = new Even();
	EvenOdd1 t1 = new EvenOdd1();
	t.start();
	t1.start();	
} 

}
