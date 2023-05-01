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

	// 컨테이너 실행
	public void run() {
		frame.setVisible(true); // 프레임 보이게 하기
		for (int i = 0;; i++) {
			Date dt = new Date();
			SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 aa hh시 mm분 ss초");
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
	}

}
