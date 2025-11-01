import java.awt.*;
// import java.awt.event.*;

class MyFrame extends Frame {
	public void paint(Graphics g){
		g.setColor(Color.white);
		for(;;){
			int x = (int)(Math.random()*800);
			int y = (int)(Math.random()*600);
			g.drawLine(x,y,x,y);
			try{
				Thread.sleep(20);
			}
			catch(InterruptedException e){}
		}
	}
}

class Dots {
	public static void main(String[] args){
		MyFrame f = new MyFrame();
		f.setBackground(Color.black);
		f.setTitle("DOTS");
		f.setSize(400,400);
		f.setVisible(true);
	}
}
