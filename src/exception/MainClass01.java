package exception;


class A01{
	public void test() {
		int num=0;
		try {
			int re = 10/num;
			System.out.println("문제없음");
			
		} catch (Exception e) {
			System.out.println("문제있음");
//			e.printStackTrace();
		
		}finally {
			System.out.println("finally실행");
		}
		System.out.println("다음문장 실행");
	}
		
	
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		a.test();
	}
}
