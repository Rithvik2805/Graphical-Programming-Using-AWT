import java.awt.*;
import java.awt.event.*;

class MyDrawing extends Frame{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.drawRect(40,40,200,200);
		g.drawOval(90,70,80,80);
		g.drawOval(110,95,5,5);
		g.drawOval(145,95,5,5);
		g.drawLine(130,95,130,115);
		g.drawArc(113,115,35,20,0,-180);
	}
}

class SmilingFace{
	public static void main(String[] args){
		MyDrawing d = new MyDrawing();
		d.setTitle("SmilingFace");
		d.setSize(400,400);
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}