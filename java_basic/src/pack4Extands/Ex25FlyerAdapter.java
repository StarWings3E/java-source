package pack4Extands;


// Adapter 클래스는 특정 인터페이스의 추상메소드를 일반 메소드로 오버라이딩한 추상 클래스를 뜻함.
// 인터페이스의 추상 메소드를 implements 한 자식 클래스는 메소드 모두를 오버라이딩 해야 하는 부담이 있어서,,
// 이를 개선하기 위한 목적으로 '어댑터 클래스'를 사용할수 있다.

abstract public class Ex25FlyerAdapter implements Flyer{
	
	public void fly() {
		
	}
	
	public boolean isAnimal() {
		return false;
	}
	
	
	
	
	
}
