package pack2;


// package : 성격이 비슷한 클래스들을 특정 패키지(폴더)에 저장해 두고 import를 이용해 클래스의 멤버를 ㅎ출
public class Ex5Bank {
	private int money = 1000;
	int imsi = 1;
	public int imsi2 = 2;
	
	public Ex5Bank() {
		
	}
	
	public Ex5Bank(int money) {	// constructor overloading
		this.money += money;	// 누적 this.money = this.money + money; 한거와 동일하다.
		
	}
	
	public void dePosit(int amount) {	// 입금
		if(amount > 0) money += amount;
	}
	
	public void withDraw(int amount) {	// 입금
		if((amount > 0) && (money - amount >= 0)) {
			money -= amount;
		}else {
			System.out.println("출금액에 문제가 있네요.");
		}
	}
	
	public int getMoney() {	// 잔금 확인
		return money;
	}
	
	
}
