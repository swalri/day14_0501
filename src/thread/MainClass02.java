package thread;

import java.util.Scanner;

class A02 extends Thread{
	public void run() {
		while(true) {
			System.out.println("출력공간");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = null;
		A02 a = new A02();
		a.start();
		
		while(true) {
			System.out.println("입력");
			s = scan.next();
			System.out.println(s);
		}
	}
}
