import java.awt.*;

class SubClass extends Frame{
	SubClass(String str){
		super(str);
	}		
}

class SubclassOfFrame{
	public static void main(String[] args){
		SubClass sc = new SubClass("MyFrame");
		sc.setSize(400,240);
		sc.setVisible(true);
	}
}
