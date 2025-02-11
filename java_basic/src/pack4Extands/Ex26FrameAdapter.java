package pack4Extands;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex26FrameAdapter extends WindowAdapter{	// 상속
	private Frame frame;	// 포함 관계.
	
	public Ex26FrameAdapter() {
		frame = new Frame("어댑터 사용");
		frame.setSize(400, 300);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		
		frame.addWindowListener(this);
		
		
	}
	
	@Override
		public void windowClosing(WindowEvent e) {
			// 윈도우 이벤트 관련 메소드 엄청많은데 그중에서 어댑터를 사용하여 그중 하나만 가져온것.
			super.windowClosing(e);
		}
	
	
	
	public static void main(String[] args) {
		
	}

}
