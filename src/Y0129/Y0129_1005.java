package Y0129;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Y0129_1005 extends JFrame{
	JSlider j = new JSlider(100,200,150);
	JLabel j1 = new JLabel(" ");
	
	Y0129_1005(){
		setTitle("Y0129_1005 : 드래깅");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j); 
		c.add(j1);
		
		j.setMajorTickSpacing(20); // 큰 눈금 간격
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER);
//		j1.setOpaque(true); // 투명도 설정. Magenta 설정을 먹게 하겠다.
		j1.setBackground(Color.MAGENTA);
		j1.setText(Integer.toString(j.getValue()));
		//눈금 정수값을 문자열로 변경해서 프레임에 띄운다.
		
		j.addChangeListener(new ChangeListener() { // 눈금 옮기면 값 표현

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				j1.setText(Integer.toString(j.getValue()));
			}
		});
		
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Y0129_1005();
	}
}
