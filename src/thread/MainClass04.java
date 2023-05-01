//package thread;
//
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Scanner;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//class container extends Thread {
//	JFrame frame;
//	JLabel label;
//	Scanner scan = new Scanner(System.in);
//
//	// 컨테이너 생성
//	public container() {
//		frame = new JFrame("label example");
//		label = new JLabel("");// 글초기화
//		Container con = frame.getContentPane();
//		Font font = new Font("bell MT", Font.ITALIC, 16);// 글 폰트
//
//		label.setFont(font);
//		con.add(label);
//		frame.setLocation(500, 300); // 프레임 위치
//		frame.setPreferredSize(new Dimension(500, 200));// 프레임 사이즈
//		frame.pack(); // 프레임 설정
//		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료
//	}
//
//	// 컨테이너 실행
//	public void run() {
//		frame.setVisible(true); // 프레임 보이게 하기
//		for (int i = 0;; i++) {
//			Date dt = new Date();
//			SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 aa hh시 mm분 ss초");
//			String s_t = s.format(dt);
//
//			label.setText(s_t);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//	// 기능 구현
//	public void display() {
//		while (true) {
//			System.out.println("=================");
//			System.out.println("1. 로그인");
//			System.out.println("2. 회원가입");
//			System.out.println("3. 로그아웃");
//			System.out.println("4. 종료");
//			int num = scan.nextInt();
//			switch (num) {
//			case 1:
//				login();
//				break;
//			case 2:
//				break;
//			case 3:
//				frame.setVisible(false);
//				break;
//			case 4:
//				System.exit(0);
//				break;
//			default:
//				break;
//			}
//		} // while
//	}
//
//	// id 입력
//	private void inputId() {
//		String id;
//		System.out.print("id : ");
//		id = scan.next();
//		setId(id);
//	}
//
//	// pwd 입력
//	private void inputPwd() {
//		String pwd;
//		System.out.print("pwd : ");
//		pwd = scan.next();
//		setPwd(pwd);
//	}
//
//
//}
//
//public class MainClass04 {
//	public static void main(String[] args) {
//		container con = new container();
//		con.display();
//	}
//}
