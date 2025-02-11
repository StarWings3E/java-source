package pack4Extands;
import java.awt.Frame;

public class Ex14FrameSangsok extends Frame {
	public Ex14FrameSangsok() {
		super("상속 연습용");
		
	}
	
	public void frameVisible() {
		setSize(500, 300);
		// 상속 없이 참조시 super.setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}
	
	
	public static void main(String[] arg) {
		Ex14FrameSangsok frameSangsok = new Ex14FrameSangsok();
		frameSangsok.frameVisible();
		
		
	}
	
	
}
