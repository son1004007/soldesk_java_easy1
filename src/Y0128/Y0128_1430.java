package Y0128;

// 팝업 다이얼로그
// 1) 입력 다이얼로그
// JOptionPane.showInputDialog()
// "OK" 버튼을 누르면 입력한 값 리턴
// "Cancel" 버튼을 누르면 Null 값 리턴

// 2) 확인 다이얼로그
// JOptionPane.showConfirmDialog()

// 3) 메시지 다이얼로그
// JOptionPane.show
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Y0128_1430 extends JFrame {
	Y0128_1430() {
		super("다이얼로그");
		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);
		setSize(512,512);
		setVisible(true);
	}
	class Dia extends Panel {
		JButton j = new JButton("이름 입력");
		JTextField j1 = new JTextField(10);
		JButton j2 = new JButton("확인");
		JButton j3 = new JButton("메시지");
		
		
		
		Dia() {
			setBackground(Color.pink);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			
			
			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름 입력");
					if (name != null) { // 이름을 입력했다
						j1.setText(name);
					}
				}
			});
			j2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r =
							JOptionPane.showConfirmDialog
							(null, "계속할겁니까?", "확인",
									JOptionPane.YES_NO_OPTION);
					if (r == JOptionPane.CLOSED_OPTION) {
						j1.setText("선택안했다");
					}
					else if (r == JOptionPane.YES_OPTION) {
						j1.setText("네");
					}
					else
						j1.setText("아니오");
				}
			});
			j3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog
					(null, "경고", "메시지",
							JOptionPane.WARNING_MESSAGE);
				}
			});
		}
	}
	public static void main(String[] args) {
		new Y0128_1430();
	}
}
