import java.awt.*;
import java.awt.event.*;

class DisplayRadioButtons extends Frame implements ItemListener{
	String msg = "";
	CheckboxGroup cbg;
	Checkbox y, n;
	DisplayRadioButtons(){
		setLayout(new FlowLayout());
		cbg = new CheckboxGroup();
		y = new Checkbox("Yes", cbg, true);
		n = new Checkbox("No", cbg, false);
		add(y);
		add(n);
		y.addItemListener(this);
		n.addItemListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		msg = "Current Selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
	}
	public static void main(String[] args){
		DisplayRadioButtons drb = new DisplayRadioButtons();
		drb.setSize(400,400);
		drb.setTitle("Radio Bittons");
		drb.setVisible(true);
	}
}