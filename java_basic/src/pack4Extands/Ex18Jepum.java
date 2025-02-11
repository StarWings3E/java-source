package pack4Extands;


// 전자 제품 관련 부모 클래스 (추상)
abstract public class Ex18Jepum {	// 전자 제품이 공통으로 가져야할 멤버 선언
	public int volume = 0;
	
	public Ex18Jepum() {
		System.out.println("추상 클래스 생성자");
	}
	
	abstract public void volumeControl();	// 추상메소드 ( body {} 가 없음.)
	// 내용이 없어서 추상클래스는 new를 하면 안된다.
	
	public void volumeShow() {
		System.out.println("소리 크기 : " + volume);
		
	}
	
	
	
	
	
	
}