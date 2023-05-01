package exception;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.println("수 입력");
				num = scan.nextInt();
				System.out.println(num);
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
				System.out.println("문제 발생");
			}
		}
		
		
		
	}
}
