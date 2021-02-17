package Y0128;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JTextArea;

class Text implements ActionListener{

 

 JTextArea jt;

 Text(JTextArea jt){

  this.jt=jt;

 }

 public void actionPerformed(ActionEvent e) {

  jt.setText("삭제됨!");

  jt.append("내용 입력");

 }

}

public class Y0128_0930 {

 public static void main(String[] args) { 

  

  JFrame j=new JFrame();

  j.setLayout(new FlowLayout());

  

  JTextArea jt=new JTextArea(10,20);

  jt.append("입력");

  jt.setLineWrap(true);

  //자동 줄 바꿈 여부 설정

  

  JButton b=new JButton("삭제");

  

  b.addActionListener(new Text(jt));
  j.add(b);
  j.setVisible(true);

  

 }

}