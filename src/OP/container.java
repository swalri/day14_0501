package OP;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class container extends Thread {
	JFrame frame = new JFrame("label example");
	JLabel label = new JLabel("");// 글초기화
	Container con = frame.getContentPane();
	Font font = new Font("bell MT", Font.ITALIC, 16);// 글 폰트

	// 컨테이너 생성
	public container() {
		label.setFont(font);
		con.add(label);
		frame.setLocation(500, 300); // 프레임 위치
		frame.setPreferredSize(new Dimension(500, 200));// 프레임 사이즈
		frame.pack(); // 프레임 설정
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료
	}
	
	Date dt = new Date();
	SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 aa hh시 mm분 ss초");
	long start;
	// 컨테이너 실행
	public void run() {
		frame.setVisible(true); // 프레임 보이게 하기
		start = System.currentTimeMillis();
		for (int i = 0;; i++) {
			dt = new Date();
			String s_t = s.format(dt);
			label.setText(s_t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 컨테이너 종료기능
	public void containerstop() {
		frame.setVisible(false);
		long end = System.currentTimeMillis();
		SimpleDateFormat s = new SimpleDateFormat("hh시 mm분 ss초");
		// 1시간 60분 3600초 3600000
		int end_hour = (int) (end/1000/60/60);
		int end_min = (int) (end/1000/60%60);
		int end_sec = (int) (end/1000%60);
		int start_hour = (int) (start/1000/60/60);
		int start_min = (int) (start/1000/60%60);
		int start_sec = (int) (start/1000%60);
		System.out.println(end_hour-start_hour);
		System.out.println(end_min-start_min);
		System.out.println(end_sec-start_sec);
//		String s_t = s.format(end-start);
//		System.out.println("사용 시간 "+s_t);
	}

}
