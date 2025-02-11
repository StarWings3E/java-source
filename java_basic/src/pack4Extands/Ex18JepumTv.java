package pack4Extands;

public class Ex18JepumTv extends Ex18Jepum{
	public Ex18JepumTv() {
		System.out.println("티비 생성자");
	}
	
	
	@Override
	public void volumeControl() {
		// 부모의 [추상]메소드는 오버라이드를 강요한다. [ 무 조 건 ] 써야함.
		System.out.println("라디오 소리 조이고 내리기~ ");	
	}
	
	@Override
	public void volumeShow() {
		// 부모의 일반 메소드는 오버라이드를 선택해서 사용해도 안해도 상관없다.
		int volume = 10;
		System.out.println("볼륨 크기 : " + volume);
	}
	
	
	
	
	
	

}
