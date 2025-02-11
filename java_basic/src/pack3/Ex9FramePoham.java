package pack3;
import java.awt.Frame;

public class Ex9FramePoham {
	String name = "신기해";
	private Frame frame;	// 외부 클래스를 사용
	
	public Ex9FramePoham() {
		frame = new Frame("포함 연습용");	// 클래스의 포함관계 ( 다른 전문가가 만든 클래스 가져온것 )
		
		//frame.setSize(500, 300);	// 너비와 높이 지정
		//frame.setLocation(200, 150);
		//frame.setVisible(true);
	}
	
	
	// 생성자는 초기화 및 전체 윤곽만 적고, 나머지(처리 로직)는 별도 메소드로 작성하는 것이 좋음.
	public void frameVisible() {
		frame.setSize(500, 300);	// 너비와 높이 지정
		frame.setLocation(200, 150);
		frame.setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		//new Ex9FramePoham();	// 객체변수가 굳이 필요하지 않음. 생성자에서 모든일이 처리되므로, 근데 이런경우는 많지 않다.
		
		//Ex9FramePoham framePoham = new Ex9FramePoham();  // 생성자에서 다해버린다면 생성자만 찍으면 되는데, 그 경우는 많지 않다.
		//framePoham.frameVisible();
		
		//위 두줄을 한줄로 표현가능.	(한번만 호출한다면 사용가능) 두세번 호출할꺼면 위에 코드로 써야함.
		new Ex9FramePoham().frameVisible();
		
		
	}

	
	
	
	
}
