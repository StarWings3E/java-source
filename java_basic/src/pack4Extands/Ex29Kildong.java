package pack4Extands;

public class Ex29Kildong {
	public Ex29Saram getSaram() {
		//return new Ex29Saram();
		
		return new Ex29Saram()
		{	// 내부 무명클래스
			public String getIrum() {	// Ex29Saram 클래스의 메소드를 오버라이딩 해야함.
				String ir = "홍길동";
				return ir;
			}
		};
		
		
	}
	
}
