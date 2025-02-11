package pack5;

public class Ex48Bank {
	private int money = 10000;
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//public void saveMoney(int mon) {	// 입금
	synchronized public void saveMoney(int mon) {	// 싱크로라이즈가 적용된 메소드 내의 멤버필드는 스레느에서 공유가 가능하다.
		// 어떤 스레드가 멤버필드 money를 사용하는 동안 락이 거림.
		// saveMoney 메소드 수행이 끝나면 자동으로 락이 풀림.
		
		
		int m = this.getMoney();
		try {
			Thread.sleep(2000);		// 입금 지연시간 2초.
		} catch (Exception e) {
			
		}
		this.setMoney(m+ mon);
		
	}
	
	public synchronized void minusMoney(int mon) {	// 출금
		int m = this.getMoney();
		try {
			Thread.sleep(3000);		// 출금 지연시간 3초.
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.setMoney(m- mon);
		
	}
	
	
	
	
	
}
