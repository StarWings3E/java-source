package pack4Extands;

abstract public class Ex18Radio extends Ex18Jepum{
	
	@Override
	public void volumeControl() {
		// 부모의 [추상]메소드는 오버라이드를 강요한다. [ 무 조 건 ] 써야함.
		System.out.println("라디오 소리 조이고 내리기~ ");	
	}
	
	

}
