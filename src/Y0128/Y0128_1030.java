package Y0128;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Y0128_1030 extends JFrame {
	Y0128_1030(){
		String[] s = {"치킨","라면"};
		ImageIcon[] im=
			{new ImageIcon("C:/Users/son10/Pictures/best_menu09.jpg"), 
					new ImageIcon("C:/Users/son10/Pictures/fkaus.jpg")

			};
		JLabel j = new JLabel(im[0]);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox com = new JComboBox(s);
		c.add(com);
		c.add(j);
		//////////////////////
		//액션 만들기
		
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = com.getSelectedIndex();
				j.setIcon(im[i]);
				//콤보박스의 선택된 아이테 ㅁ인덱스 알아네기
				
			}
			
		});
		
		
		
		/////////////////
		setSize(512,512);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Y0128_1030();
	}
}
