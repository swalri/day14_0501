package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("label example");
		Container con = frame.getContentPane();
		JLabel label = new JLabel("label");//글초기화
		Font font = new Font("bell MT", Font.ITALIC, 32);//글 폰트
		
		label.setFont(font);
		
		con.add(label);
		frame.setLocation(500,300); //프레임 위치
		frame.setPreferredSize(new Dimension(500,200));//프레임 사이즈
		frame.pack(); //프레임 설정
		frame.setVisible(true); //프레임 보이게 하기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료
		
		for(int i=0;i<100;i++) {
			label.setText(i+". 변경");//글 설정
		}
		
	}
}
