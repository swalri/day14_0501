package OP;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		String s;
		System.out.println("인증 프로그램 입니다");
		while(true) {
			System.out.println("90년생 이상은 '가입불가'");
			System.out.println("89년생 이하는 '가입가능'");
			System.out.println("'A,ㅁ,ㅋ 문자는 잘못 입력'");
			System.out.print("주민번호 입력(앞6자리) : ");
			try {
				s = scan.nextLine();
				num = Integer.parseInt(s);
				if(s.length()!=6 && num>=1000000) {
					System.out.println("길이가 틀렸습니다");
				}else {
					if(num/10000 <= 89 && num/10000 >= 30) {
						System.out.println("가입 가능");
					}else {
						System.out.println("가입 불가능");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("숫자를 입력 하세요");
			}
		}
	}
}
