package Y0202;
//8. GridLayout4행 3열로 배치하고 JLabel 을 12개 부착한다. 
//초기 배경색을 하얀색으로 설정하고, 레이블 위에 마우스로 클릭하면 색이 랜덤하게 채워지도록 프로그램을 작성해라. 
//다음 코드를 이용해라.

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//int r=(int)(Math.random()*256);
//int g=(int)(Math.random()*256);
//int b=(int)(Math.random()*256);
public class Y0202_1450 extends JFrame{

	Y0202_1450(){
		setLayout(new GridLayout(4,3));
		JLabel[]j = new JLabel[12];
		
		Container c = getContentPane();
		setSize(254,254);
		setVisible(true);
		
		for(int i=0; i< j.length; i++) {
			j[i]=new JLabel(Integer.toString(i));
			j[i].setBackground(Color.white);
			c.add(j[i]);
			
			j[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
					JLabel j = (JLabel)e.getSource();
					
					int r=(int)(Math.random()*256);
					int g=(int)(Math.random()*256);
					int b=(int)(Math.random()*256);
					
					j.setOpaque(true);
					j.setBackground(new Color(r,g,b));
				}
			});
		}
	}
	public static void main(String[] args) {
		new Y0202_1450();
	}
}
