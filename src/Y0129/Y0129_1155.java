package Y0129;
//6.이미지 세개를 다운받아프레임에 부착해라.(for문 사용해서 부착)

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Y0129_1155 extends JFrame {
	Y0129_1155(){
		this.setLayout(new FlowLayout());
		
		ImageIcon[] im=
		{new ImageIcon("C:/Users/son10/Pictures/best_menu09.jpg"), 
			new ImageIcon("C:/Users/son10/Pictures/fkaus.jpg"),
			new ImageIcon("C:/Users/son10/Pictures/test1.jpg")
			};
		
		JLabel j[] = new JLabel[3];
		for(int i =0; i < 3; i++) {
			j[i] = new JLabel(im[i]);
			this.add(j[i]);
		}
		
		setSize(512,2048);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Y0129_1155();
	}
}
