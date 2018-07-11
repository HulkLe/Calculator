package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CalUI extends JFrame{
	
	private static final long serialVersionUID = 1L;
	//定义并new对象
	JTextArea textArea=new JTextArea();
	JButton b0=new JButton("0");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton equal=new JButton("=");
	JButton exit=new JButton("退出");
	JButton add=new JButton("+");
	JButton des=new JButton("-");
	JButton mul=new JButton("*");
	JButton div=new JButton("/");
	
	
	
	//定义一个标签，当一次计算完毕，下一步自动清屏
	boolean tagfinish=false;
	
	public CalUI() {
		setTitle("计算器");
		setBounds(100, 100, 500, 500);
		setResizable(false);
		this.setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		textArea.setBounds(50, 30, 400, 60);
		this.add(textArea);
		
		b1.setBounds(50, 130, 70, 50);
		this.add(b1);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("1");
			}
		});
		
		b2.setBounds(140, 130, 70, 50);
		this.add(b2);
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("2");
			}
		});
		
		b3.setBounds(230, 130, 70, 50);
		this.add(b3);
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("3");
			}
		});
		
		b4.setBounds(50, 200, 70, 50);
		this.add(b4);
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("4");
			}
		});
		
		b5.setBounds(140, 200, 70, 50);
		this.add(b5);
		
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("5");
			}
		});
		
		b6.setBounds(230, 200, 70, 50);
		this.add(b6);
		
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("6");
			}
		});
		
		b7.setBounds(50, 270, 70, 50);
		this.add(b7);
		
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("7");
			}
		});
		
		b8.setBounds(140, 270, 70, 50);
		this.add(b8);
		
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("8");
			}
		});
		
		b9.setBounds(230, 270, 70, 50);
		this.add(b9);
		
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("9");
			}
		});
		
		b0.setBounds(50, 340, 70, 50);
		this.add(b0);
		
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tagfinish)
				{
					textArea.setText("");
					tagfinish=false;
				}
				textArea.append("0");
			}
		});
		
		equal.setBounds(140, 340, 70, 50);
		this.add(equal);
		
		equal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String res=Cal(textArea.getText());
				textArea.setText(res);
				tagfinish=true;
			}
		});
		
		exit.setBounds(230, 340, 70, 50);
		this.add(exit);
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add.setBounds(340, 130, 80, 50);
		this.add(add);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("+");
			}
		});
		
		des.setBounds(340, 200, 80, 50);
		this.add(des);
		
		des.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("-");
			}
		});
		
		mul.setBounds(340, 270, 80, 50);
		this.add(mul);
		
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("*");
			}
		});
		
		div.setBounds(340, 340, 80, 50);
		this.add(div);
		
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("/");
			}
		});
		

		
		setVisible(true);
	}

	public String Cal(String text) {
		
		Stack<Integer> number=new Stack<Integer>();
		Stack<Character> op=new Stack<Character>();
	
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='+'||text.charAt(i)=='-'||text.charAt(i)=='*'||text.charAt(i)=='/')
			{
			number.push(new Integer(String.valueOf(temp.toString())));
			temp.setLength(0);
			   if(op.isEmpty()||compare(op.peek(),text.charAt(i)))
			   {//后面优先级大
			   op.push(text.charAt(i));
			   }
			   else
			   {
				   while(!op.isEmpty()&&!compare(op.peek(),text.charAt(i)))
				   {
					   int b=number.pop();
					   int a=number.pop();
					   int c=ans(a,b,op.pop());
					   number.push(c);
				   }
				   op.push(text.charAt(i));
			   }
			}
			else
			{
				temp.append(text.charAt(i));
			}
		}
		number.push(new Integer(String.valueOf(temp.toString())));
		
		
		while(!op.isEmpty())
		{
		   Character character=op.pop();
		   int b=number.pop();
		   int a=number.pop();
		   if(character=='*')
		   {
			    number.push(a*b);
		   }
		  else if(character=='/')
		  {
			  number.push(a/b);
		  }
		  else if(character=='+')
		  {
			  number.push(a+b);
		  }
		  else 
		  {
			  number.push(a-b);
		  }
		}
		return number.pop().toString();
	}
	
	
	boolean compare(Character a,Character b)
	{
		if((a=='+'||a=='-')&&(b=='*'||b=='/'))
		return true;
		else
		return false;
	}
	
	int ans(int a,int b,Character c)
	{
		if(c=='+')
			return a+b;
		else if(c=='-')
			return a-b;
		else if(c=='*')
			return a*b;
		else 
			return a/b;
	}
}
