package pack3;

public class Ex8PohamCar {	// 여러개의 부품 클래스를 불러다가 완성차를 생산하기 위한 클래스.
	int speed = 0;		// Ex8PohamCar 고유멤버임.
	String ownerName;	// Ex8PohamCar 고유멤버임.
	String ownerName2 = new String();	// String을 원래 이렇게 써야함. '참조형' 이니까.
	String turnShow;	// Ex8PohamCar 고유멤버임.
	
	// 클래스의 포함관계 ( has a )
	//Ex8Handle handle = new Ex8Handle();	// 외부클래스를 현재 클래스의 멤버처럼 사용하기 ㅟ함.
	Ex8Handle handle;
	// 엔진, 타이어. 램프 등등을 클래스에 포함관계로 호출해서사용. 객체지향적인 프로그래밍(oop) 철학!
	
	public Ex8PohamCar() {
		
		
	}
	
	public Ex8PohamCar(String ownerName) {	// 생성자 오버로딩.
		this.ownerName = ownerName;
		handle = new Ex8Handle();
		
	}
	
	void driveTurnHandle(int q) {	// Ex8Handle 클래스에서 q는 회전량으로 만들어놧음.
		if(q > 0) turnShow = handle.rightTurn(q);
		if(q < 0) turnShow = handle.leftTurn(q);		// if문 밑에 또다른 윗내용이 아닌것 적을때 else가 아니고 if계속 찍어도됨. 가능은함.
		if(q == 0) turnShow = handle.straight(q);
	}
	
	
}
