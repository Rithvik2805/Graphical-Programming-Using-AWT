import java.awt.*;
import java.awt.event.*;

class DisplayButtonsUsingFlowLayout extends Frame implements ActionListener{
	Button b1, b2, b3;
	DisplayButtonsUsingFlowLayout(){
		this.setLayout(new FlowLayout());
		b1 = new Button("Yellow");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		add(b1);
		add(b2);
		add(b3);
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
		if(ae.getSource()==b1) setBackground(Color.yellow);
		if(ae.getSource()==b2) setBackground(Color.green);
		if(ae.getSource()==b3) setBackground(Color.blue);
	}
	public static void main(String[] args){
		DisplayButtonsUsingFlowLayout bt = new DisplayButtonsUsingFlowLayout();
		bt.setSize(400,400);
		bt.setTitle("MyButtons");
		bt.setVisible(true);
	}
}