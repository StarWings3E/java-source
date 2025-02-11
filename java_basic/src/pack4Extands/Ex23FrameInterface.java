package pack4Extands;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex23FrameInterface extends Frame implements WindowListener, MouseListener{
	public Ex23FrameInterface() {
		super.setTitle("이벤트 처리함");
		
		setSize(400, 300);
		setLocation(200, 200);
		setVisible(true);
		
		// 윈도우 관련 이벤트 처리를 하려면 윈도우 리스너를 Frame에 장착 해줘야함.
		super.addWindowListener(this);		// 클래스의 세계에서 자신을 지칭하는것 this다. 그래서 딴놈들 지칭할때 this. <<쩜 찍고 불러오지 않냐.
		// 마우스 관련 이벤트처리를 마우스리스너에 Frame을 장착함.
		addMouseListener(this);
		
	}
	
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("원도우 종료 처리 메소드");
		System.exit(0);	// 응용프로그램 강제 종료.
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	
	
	// 마우스 이벤트 발생
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("마우스클릮드 메소드 수행");
		int a = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		int c = (int)(Math.random()*255);
		
		setBackground(new Color(a, b, c));
		System.out.println((int)(Math.random()*255));			// <<< 매쓰 쩜 랜덤 : 난수 발생.
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
				
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
				
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
				
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
				
	}
	
	
	
	

	public static void main(String[] args) {
		new Ex23FrameInterface();
		

	}

}
