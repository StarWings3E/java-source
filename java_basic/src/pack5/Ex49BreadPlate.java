package pack5;

public class Ex49BreadPlate {
	private int breadCount = 0;
	
	public Ex49BreadPlate() {
		// TODO Auto-generated constructor stub
	}
	
	synchronized public void makeBread() {		// 동기화됨.
		
		// 완성본 아님 실행안됨
		
		if(breadCount >=10) {
			try {
				System.out.println("빵생산 초과");
				this.wait();					// 활성화 상태인 스레드를 비활성화 상태로 전환.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		breadCount++;	// 빵생산.
		System.out.println("빵을 만듦. 총 " + breadCount + "개");
		this.notify();		// 비활성화 상태인 스레드를 비활성화 상태로 전환.
		
		
		
	}
	
	synchronized public void eatBread() {		
		
		if(breadCount < 1) {
			try {
				System.out.println("빵이 없어 기다림.");
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		breadCount--;	// 빵 소비.
		System.out.println("빵을 먹음. 총 " + breadCount + "개");
		this.notify();
	}
	
	
	

}
