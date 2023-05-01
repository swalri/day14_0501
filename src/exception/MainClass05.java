package exception;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int age=0;
		System.out.println("나이 입력");
		

		try {
			age = scan.nextInt();
			if(age<1) {
				throw new Exception("잘못 입력");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(age);
		
		
		
		
		
		
		
	}
}
