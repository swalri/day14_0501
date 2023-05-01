package exception;

import java.util.Scanner;

class A02{
	public void test() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("문제가 발생하지 않았습니다");
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문제가 발행하면");
		}finally {
			System.out.println("마지막에 해야하는 작업");
			scan.close();
		}
		System.out.println("다음문장들 실행");
		return;
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.test();
	}
}
