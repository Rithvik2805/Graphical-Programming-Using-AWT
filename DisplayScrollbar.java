import java.awt.*;
import java.awt.event.*;

class DisplayScrollbar extends Frame implements AdjustmentListener {
	String msg = "";
	Scrollbar s1;
	DisplayScrollbar(){
		setLayout(null);
		s1 = new Scrollbar(Scrollbar.VERTICAL, 0, 30, 0, 400);
		s1.setBounds(250, 50, 30, 200);
		add(s1);
		s1.addAdjustmentListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("SCROLLBAR POSITION: ", 20, 150);
		msg += s1.getValue();
		g.drawString(msg, 20, 180);
		msg = "";
	}
	public static void main(String[] args){
		DisplayScrollbar ds = new DisplayScrollbar();
		ds.setTitle("MyScrollbar");
		ds.setSize(400,400);
		ds.setVisible(true);
	}
}