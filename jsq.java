package zk;

import java.util.*;
import java.applet.*;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Jsq extends Applet implements ActionListener {
  JTextField textA, textB, textC;
	JButton b1, b2, b3;
    JLabel t1,t2,t3;
	
	public void init() {
		setSize(250, 150);
		/* 这里的代码实现设置布局、创建有关的组件、添加组件，为按钮注册监视器等 */
		JPanel MyPanel= new JPanel();
		MyPanel.setLayout(new GridBagLayout());
		GridBagConstraints c= new GridBagConstraints();
		
		textA=new JTextField();
		textB=new JTextField();
		textC=new JTextField();
		
		b1=new JButton("加");
		b2=new JButton("减");
		b3=new JButton("乘");
		
		t1=new JLabel("运算数1");
		t2=new JLabel("运算数2");
		t3=new JLabel("计算结果");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		MyPanel.add(t1);
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.fill=GridBagConstraints.HORIZONTAL;
		
		MyPanel.add(textA,c);
		
		MyPanel.add(t2);
		MyPanel.add(textB,c);
		
		MyPanel.add(t3);
		MyPanel.add(textC,c);
		
		MyPanel.add(b1);
		MyPanel.add(b2);
		MyPanel.add(b3);
		
		add(MyPanel);
		setVisible(true);
		
	}

	

	public void actionPerformed(ActionEvent e) {
		/* 这里的代码实现响应按钮事件的处理 */
		String tA= textA.getText();
		String tB= textB.getText();
		int Sum;
		if(e.getSource()== b1){
			Sum=Integer.parseInt(tA)+Integer.parseInt(tB);
			
			textC.setText(""+Sum);
		}
		if(e.getSource()== b2){
			Sum=Integer.parseInt(tA)-Integer.parseInt(tB);
			
			textC.setText(""+Sum);
		}
		if(e.getSource()== b3){
			Sum=Integer.parseInt(tA)*Integer.parseInt(tB);
			
			textC.setText(""+Sum);
		}
	}
}

