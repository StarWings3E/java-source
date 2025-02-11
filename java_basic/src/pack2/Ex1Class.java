package pack2;

public class Ex1Class {

	public static void main(String[] args) {// Ex1Main은 main 메소드를 실행하기 위한 클래스임.
		// main은 응용 프로그램의 시작을 위해 정해진 메소드이다.
		
		// Ex1Car 설계도로 객체를 생성. 이런 과정을 객체를 인스턴스(instance)라고 한다고 함.
		// 다시말해 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화 라고하며, 어떤 클래스로부터
		// 만들어진 객체를 그 클래스의 인스턴스라고 한다.
		// 객체는 모든 인스턴스를 대표하는 포괄적인 의미이다.
		// 클래스 -- 인스턴스화 --> 객체	// 인스턴스 또는 오브젝트
		
		// Ex1Car.class를 주기억장치로 읽은 후 car1 객체변수를 선언.
		// new 키워드로 인스턴스를 진행. 이 때 Ex1Car()이라는 생성자를 호출.
		
		Ex1Car car1 = new Ex1Car();	// 객체변수, 참조형변수, 
		
		// Ex1Car 멤버필드(전역변수) 호출--------------
		System.out.println(car1.wheel);	//	<< 휠은 default값을 가지고있어 호출이 가능함.
		//System.out.println(car1.airBag);	<< car1 에 가보면 private로 되어있어 다른 클래스에서 호출하여 사용못한다.
		System.out.println(car1.irum);
		
		// Ex1Car 메소드 호출--------------
		// car1.abc(); // car1 에 가보면 private이라서 호출불가.
		car1.def();
		
		System.out.println();
		String ss = car1.driving();	// car1에서 String으로 던졋기 때문에 같은 값으로 받아서 출력한다. // 값을 ss에 보관하여 다른곳에 사용하기 위함.
		// 다시 변수 값을 만들어주는거지만, 그 내용은 다른 클래스에서 만든것을 가져온것.
		ss = "와우 " + ss;			// <= 받은 값을 사용하는 ex..
		System.out.println(ss);	
		
		System.out.println(car1.driving());	// 값을 반환하지 않는다.
		
		System.out.println();
		car1.drivingGood(2);	// 매개변수에 값을 넣어줘야지만 사용가능함. 클래스 가서 확인해봐.
		// 매개변수가 있는 
		// Paraneter와 Argument
		
		System.out.println("\n=================================");
		Ex1Car car2 = new Ex1Car(); // 새로운 객체 생성.
		// car1과 car2는 type이 같은 두개의 객체변수
		System.out.println(car2.wheel);
		car2.def();
		
		
		
		
	}

}

/*	클래스를 공부하는 이유
 *	1) 직접 객체를 생성 후사용하기 위함.
 *	2) 다른 사람이 만든 클래스를 활용하기 위함.
 */