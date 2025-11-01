import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
	public void paint(Graphics g){
		this.setBackground(new Color(100,20,20));
		Font f = new Font("Arial", Font.BOLD+Font.ITALIC, 30);
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString("Hello!!", 100,100);
	}
}

class Text {
	public static void main(String[] args){
		MyFrame f = new MyFrame();
		f.setTitle("Text");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}