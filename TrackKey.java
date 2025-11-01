import java.awt.*;
import java.awt.event.*;

class TrackKey extends Frame implements KeyListener{
	TextArea ta;
	String msg = "";
	TrackKey(){
		setLayout(new FlowLayout());
		ta = new TextArea(5, 25);
		Font f = new Font("SansSerif", Font.BOLD, 20);
		ta.setFont(f);
		ta.setForeground(Color.red);
		add(ta);
		ta.addKeyListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});		
	}
	public void keyPressed(KeyEvent ke){
		int keycode = ke.getKeyCode();
		msg += "\nKey code: "+keycode;
		String keyname = ke.getKeyText(keycode);
		msg += "\nKey pressed: "+keyname;
		ta.setText(msg);
		msg = "";
	}
	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){
		int keycode = ke.getKeyCode();
		msg += "\nKey code: "+keycode;
		String keyname = ke.getKeyText(keycode);
		msg += "\nKey released: "+keyname;
		ta.setText(msg);
		msg = "";
	}
	public static void main(String[] args){
		TrackKey tk = new TrackKey();
		tk.setSize(400, 400);
		tk.setTitle("Keys");
		tk.setVisible(true);
	}
}