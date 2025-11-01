import java.awt.*;
import java.awt.event.*;

class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}

class MyFrame extends Frame{
}

class WindowAdapterClass {
	public static void main(String[] args){
		MyFrame f = new MyFrame();
		f.setTitle("My Frame");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new MyClass());
	}
}