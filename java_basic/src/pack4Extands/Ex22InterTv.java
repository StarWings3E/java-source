package pack4Extands;

//public class Ex22InterTv implements Ex22InterVolume, Ex22InterAdvanceVolume{	// 추상클래스에서 못하는 다중상속!! 여긴가능.
// 인터페이스 상속은 익스텐드 아니다!!! 임플리먼트임 잘봐둬..

public class Ex22InterTv implements Ex22InterAdvanceVolume {	// 인터페이스끼리 상속받은 인터페이스를 상속받아 사용
	// 2개의 인터페이스의 내용을 상속받아 추상메소드를 모두 사용해야 오류가 없다..
	private int v = 0;
	
	@Override
		public void volResuem() {
			v=1;
			System.out.println("라디오 소리 켜기." + v);
		}
	
	
	@Override
		public void volUp(int v) {
			this.v += v;
		}
	
	@Override
		public void volDown(int v) {
			this.v -= v;
		}
	
	@Override
		public void volOff() {
			System.out.println("라디오 소리 끄기.");
		}
	
	
}
