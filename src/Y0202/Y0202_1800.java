package Y0202;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Y0202_1800 extends JFrame {
	
	JLabel en = new JLabel("¿µ¾î", SwingConstants.LEFT);
	JTextField ent = new JTextField(10);
	JLabel ko = new JLabel("ÇÑ±Û", SwingConstants.LEFT);
	JTextField kot = new JTextField(10);
	JButton in = new JButton("»ðÀÔ");
	JButton out = new JButton("Ã£±â");
	JTextArea area = new JTextArea(10, 30);
	
	HashMap<String, String> h = new HashMap<String, String>();
	Set<String> key = h.keySet();
	
	Y0202_1800() {
		add(en);
		add(ent);
		add(ko);
		add(kot);
		add(in);
		add(out);
		add(area);
		
		in.addActionListener(new ad1());
		out.addActionListener(new ad2());
		
		setLayout(new FlowLayout());
		setSize(350, 300);
		setVisible(true);

	}
	class ad1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		String str1=ent.getText();
		String str2=kot.getText();
		h.put(str1, str2);
		area.append("»ðÀÔ ("+ent.getText()+", "+kot.getText()+")");
		area.append("\n");
		}
	}
	class ad2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		String str=ent.getText();
			if(h.containsKey(str)) {
				kot.setText(h.get(str));
			}
		}
	}
		
	public static void main(String[] args) {
		new Y0202_1800();
	}
}
