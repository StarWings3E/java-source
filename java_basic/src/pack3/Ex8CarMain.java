package pack3;

public class Ex8CarMain {

	public static void main(String[] args) {
		Ex8PohamCar tom = new Ex8PohamCar("미스터 톰");
		tom.driveTurnHandle(20);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		// 점 찍고 입력. 점 찍고 입력. << 이거시 포함관계를 만들기 위한 코드
		// 각 클래스끼리 이어주는(포함시키는) 연결 수단.
		
		tom.driveTurnHandle(0);
		System.out.println(tom.ownerName + "의 회전량은 " + tom.turnShow + " " + tom.handle.quantity);
		
		// 새로운 자동차 객체 생성...!
		Ex8PohamCar oscar = new Ex8PohamCar("오스카");
		oscar.driveTurnHandle(0);
		System.out.println(oscar.ownerName + "의 회전량은 " + oscar.turnShow + " " + oscar.handle.quantity);
		// 이 코드를 사용하므로 오스카와 톰은 '각각'한대의 차를 탑승하고 있음.
		// 싱글톤코드를 쓰게된다면 같은 자동차를 공유하게 되는 원리이다.
		
		
		
		
	}

}
