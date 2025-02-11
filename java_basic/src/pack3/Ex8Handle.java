package pack3;

public class Ex8Handle {	// 완성차를 위한 부품 클래스. 자동차 핸들입니다~
	int quantity;	// 회전량
	
	public Ex8Handle() {
		quantity = 0;
		
	}
	
	String leftTurn(int quantity) {
		this.quantity = quantity;
		return "좌회줜";
	}
	
	String rightTurn(int quantity) {
		this.quantity = quantity;
		return "우회줜";
	}
	
	String straight(int q) {
		quantity = q;
		return "직줜";
	}
	
	
}
