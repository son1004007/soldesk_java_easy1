package Y0202;
//�ڵ� �����Ἥ �ۼ����� ����.
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// ���ڿ��� �ʱ�ȭ�ϰ�, 1�� �������� �ѱ��ھ� ���
public class Y0205_1040 extends JFrame {
	Y0205_1040(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
//		JLabel j = new JLabel("�������� �ʹ�.");
//		c.add(j);
//		c.add(new Th("�������� �ʹ�."));
//		setVisible(true);
//		setSize(500,100);
//		Th t = new Th();
//		t.start();
	}
	class Th extends Thread implements Runnable {// ù ȭ���� ����, 5�� �Ŀ� ȭ�� ��ũ�� ����
		JLabel jl;
		int cnt = 1;
		
		Th(JLabel jl){
			this.jl = jl;
			new Thread(this).start();
		}
		public void run() {
			getContentPane().setBackground(Color.black);
			try {
				sleep(5000);
			}catch(Exception e) {
				return ;
			}
			getContentPane().setBackground(Color.pink);
		}
	}
	public static void main(String[] args) {
		new Y0205_1040();
	}

}
