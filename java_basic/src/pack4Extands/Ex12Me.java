package pack4Extands;

public class Ex12Me extends Ex12Father{		// 다중 상속 불가능. 단일 상속만 통과.
	public Ex12Me() {
		System.out.println("내 생성자");
	}
	
	@Override
		public void say() {
			System.out.println("인생은 아름다워~~");
		}
	
	public final void biking() { 		// 이제 부터 me의 자식클래스는 biking을 오버라이딩 할수 없다.
		System.out.println("자전거로 전국일주");
	}
	
	
}
