import java.awt.*;
import java.awt.event.*;

class DisplayChoiceMenu extends Frame implements ItemListener{
	String msg;
	Choice ch;
	DisplayChoiceMenu(){
		setLayout(new FlowLayout());
		ch = new Choice();
		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");
		add(ch);
		ch.addItemListener(this);
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
		g.drawString("Selected language: ", 10,100);
		msg = ch.getSelectedItem();
		g.drawString(msg,10,120);
	}
	public static void main(String[] args){
		DisplayChoiceMenu cm = new DisplayChoiceMenu();
		cm.setSize(400,400);
		cm.setTitle("Choice Menu");
		cm.setVisible(true);
	}
}