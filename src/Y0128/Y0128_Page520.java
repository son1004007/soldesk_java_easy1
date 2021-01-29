package Y0128;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Y0128_Page520 extends JFrame {
	
	Y0128_Page520(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 처리 3");
		this.setLayout(new FlowLayout());
		
		JTextField txt = new JTextField(10);
		JTextArea area = new JTextArea(10,10);
		this.add(txt);
		this.add(area);
		
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				
				
				//아스키코드 검증용
//				char alpa = txt.getText().charAt(0);
//				int ialpa = (int)alpa;
//				System.out.println(ialpa);
				
				if(key == KeyEvent.VK_ENTER) {
					String str = txt.getText();
					str = str.toUpperCase();
					area.setText(area.getText() + str + '\n');
					txt.setText("");
				}
				
				//A-Z가 아니면 1칸 지운다.
				if(!(key >= KeyEvent.VK_A && key <=KeyEvent.VK_Z)) {
					String str = txt.getText();
					int strlen = str.length();
					if (strlen !=0) {
						txt.setText(str.substring(0, strlen -1));
					}
				}
			}
		});

		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Y0128_Page520();
	}
}
