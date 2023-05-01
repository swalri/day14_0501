package thread;
class A01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i+"A01");
		}
	}
}
class B01 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i+"BBB01");
		}
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		a.setDaemon(true);
		b.setDaemon(true);
		a.start();
		b.start();//스레드 시작 
		System.out.println("main==종료");
		System.out.println("main==종료");
		System.out.println("main==종료");
		System.out.println("main==종료");
	}
}
