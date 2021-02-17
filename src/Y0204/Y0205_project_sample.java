package Y0204;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class Y0205_project_sample {
    int count = 0;
    String show = "";
 
    public Y0205_project_sample() {
 
        // �����δ�
        // ������ ������
        JFrame frame = new JFrame("�ܹ��� �ڵ� �Ǹű�");
        frame.setBounds(0, 0, 625, 1000);
        frame.setBackground(Color.black);
 
        // ��Ʈ
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
 
        // ����
        Panel pNorth = new Panel();
        pNorth.setBackground(new Color(255, 255, 215));
        pNorth.setLayout(null);
        pNorth.setSize(0, 500);
        pNorth.setFont(font);
 
        // �迭 ���� �κ�
        String menu[] = { "��ƹ���", "���̹���", "�������", "��������",
        		"��ġ����", "�������", "������", "ġŲ����" };
        int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500 };
        JButton bt[] = new JButton[menu.length];
        TextField suja[] = new TextField[menu.length];
        Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        Label l[] = new Label[menu.length];
        ImageIcon icon[] = new ImageIcon[menu.length];
 
        // ��ư ���� �κ�
        for (int i = 0; i < menu.length; i++) {
 
            // �ܹ��� ��ư
            bt[i] = new JButton(menu[i]);
            if (i < 4) {
                bt[i].setBounds(25 + i * 150, 50, 100, 100);
            } else {
                bt[i].setBounds(25 + (i - 4) * 150, 300, 100, 100);
            }
            icon[i] = new ImageIcon(i + ".png");
            bt[i].setIcon(icon[i]);
 
            // ���� txt ��ư
            suja[i] = new TextField("0");
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
 
            // "-" ��ư
            minus[i] = new Button("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setEnabled(false);
 
            // "+" ��ư
            plus[i] = new Button("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setEnabled(false);
 
            // ����
            l[i] = new Label(price[i] + "��");
            l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
 
            // Ȯ�� ��ư
            ok[i] = new JButton("Ȯ��");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);
 
            pNorth.add(bt[i]);
            pNorth.add(suja[i]);
            pNorth.add(minus[i]);
            pNorth.add(plus[i]);
            pNorth.add(l[i]);
            pNorth.add(ok[i]);
        }
 
        // �߾�
        TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
        ta.setBackground(Color.white);
        ta.setEditable(false);
        ta.setFont(font1);
 
        // ����
        Panel pSouth = new Panel();
        pSouth.setFont(font);
        pSouth.setBackground(new Color(255, 255, 215));
 
        Button bt1 = new Button("�ֹ�");
        Button bt2 = new Button("�ʱ�ȭ");
        Button bt3 = new Button("�ݱ�");
        pSouth.add(bt1);
        pSouth.add(bt2);
        pSouth.add(bt3);
 
        // �ֹ���ư
        bt1.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
                for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
 
                }
            }
        });
 
        // �ʱ�ȭ ��ư
        bt2.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
 
                }
            }
        });
 
 
        //bt3 �ݱ��ư
        
        bt3.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
 
 
        // ������Ʈ
        frame.add(pNorth, BorderLayout.NORTH);
        frame.add(ta, BorderLayout.CENTER);
        frame.add(pSouth, BorderLayout.SOUTH);
        frame.setVisible(true);
 
        // �̺�Ʈ��
        for (int i = 0; i < menu.length; i++) {
            int j = i;
 
            // �ܹ��� ��ư �̺�Ʈ
            bt[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    bt[j].setEnabled(false);
                    ok[j].setEnabled(true);
 
                    count = 0;
                }
            });
 
            // "-" ��ư �̺�Ʈ
            minus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 0) {
                        count = count - 1;
                        suja[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });
            
            // "+" ��ư �̺�Ʈ
            plus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
            
            //Ȯ�� ��ư �̺�Ʈ
            ok[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    show = bt[j].getActionCommand();
                    ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                            + "��" + "\n");
                    ok[j].setEnabled(false);
                }
            });
 
        }
 
        // ����
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 
    // ����
    public static void main(String[] args) {
        new Y0205_project_sample();
    }
 
}