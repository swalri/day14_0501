package exception;

class A04{
	public void a01() {
		a02();
	}
	public void a02() {
		a03();
	}
	public void a03() {
		System.out.println("a03실행");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class MainClass04 {
	public static void main(String[] args){
		A04 a = new A04();
		a.a01();
		
	}
}
