package Y0202;
//코드 날려써서 작성하지 않음.
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 문자열을 초기화하고, 1초 간격으로 한글자씩 출력
public class Y0205_1040 extends JFrame {
	Y0205_1040(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
//		JLabel j = new JLabel("집에가고 싶다.");
//		c.add(j);
//		c.add(new Th("집에가고 싶다."));
//		setVisible(true);
//		setSize(500,100);
//		Th t = new Th();
//		t.start();
	}
	class Th extends Thread implements Runnable {// 첫 화면은 검정, 5초 후에 화면 핑크로 변경
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
