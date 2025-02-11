package pack4Extands;

public class Ex21Tv implements Ex21Volum{	// 인터페이스는 임폴리먼트라는 예약어로 상속을 정의함.
	private int volLevel;
	
	public Ex21Tv() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("티비 소리 올리면 " + volLevel);
			
	}
	
	@Override
		public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("티비 소리 내리면 " + volLevel);
			
		}
	
	
	
	
	
	
	
	
}
