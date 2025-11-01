import java.awt.*;
import java.awt.event.*;

class Images extends Frame{
	static Image img;
	Images(){
		img = Toolkit.getDefaultToolkit().getImage("image1.jpg");
		MediaTracker track = new MediaTracker(this);
		track.addImage(img,0);
		try{
			track.waitForID(0);
		}
		catch(InterruptedException ie){}
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g){
		g.drawImage(img, 50, 50, null);
	}
}

class ImageDisplay{
	public static void main(String[] args){
		Images i = new Images();
		i.setSize(1000,1000);
		i.setTitle("MyImage");
		i.setIconImage(Images.img);
		i.setVisible(true);
	}
}