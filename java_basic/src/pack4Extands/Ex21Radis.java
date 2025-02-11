package pack4Extands;

public class Ex21Radis implements Ex21Volum{	// 인터페이스는 임폴리먼트라는 예약어로 상속을 정의함.
	private int volLevel;
	
	public Ex21Radis() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("라디오 볼륨 올리면 " + volLevel);
			
	}
	
	@Override
		public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨 내리면 " + volLevel);
			
		}
	
	
	
	
	
	
	
	
}
