import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
}

class AnonymousAndWindowAdapter {
	public static void main(String[] args){
		MyFrame f = new MyFrame();
		f.setTitle("MyFrame");
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}