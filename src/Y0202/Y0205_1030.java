package Y0202;
import java.awt.Color;
import javax.swing.JFrame;
public class Y0205_1030 extends JFrame {
	
	Y0205_1030(){
		setVisible(true);
		setSize(500,500);
		Th t = new Th();
		t.start();
	}
	
	class Th extends Thread {// 첫 화면은 검정, 5초 후에 화면 핑크로 변경
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
		new Y0205_1030();
	}

}
