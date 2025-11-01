import java.awt.*;
import java.awt.event.*;

class DisplayButtons extends Frame implements ActionListener{
	Button b1, b2, b3;
	DisplayButtons(){
		this.setLayout(null);
		b1 = new Button("Yellow");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		b1.setBounds(100, 100,70,40);
		b2.setBounds(100, 190,70,40);
		b3.setBounds(100, 280,70,40);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if(str.equals("Yellow")) this.setBackground(Color.yellow);
		if(str.equals("Green")) this.setBackground(Color.green);
		if(str.equals("Blue")) this.setBackground(Color.blue);
	}
	public static void main(String[] args){
		DisplayButtons bt = new DisplayButtons();
		bt.setSize(400,400);
		bt.setTitle("MyButtons");
		bt.setVisible(true);
	}
}