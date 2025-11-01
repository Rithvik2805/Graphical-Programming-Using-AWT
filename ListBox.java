import java.awt.*;
import java.awt.event.*;

class ListBox extends Frame implements ItemListener {
	int[] msg;
	List lst;
	ListBox(){
		setLayout(new FlowLayout());
		lst = new List(4, true);
		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");
		add(lst);
		lst.addItemListener(this);
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
		g.drawString("Selected Languages: ", 100, 200);
		msg = lst.getSelectedIndexes();
		for(int i=0;i<msg.length;i++)
		{
			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 220+i*20);
		}
	}
	public static void main(String[] args){
		ListBox lb = new ListBox();
		lb.setSize(400, 400);
		lb.setTitle("List");
		lb.setVisible(true);
	}
}