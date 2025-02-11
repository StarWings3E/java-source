package pack2;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2Programmer programmer1 = new Ex2Programmer();
		System.out.println("보유기술 : " + programmer1.spec);
		programmer1.displayData();
		
		programmer1.nickName = "웹 전문가";	// public 멤버필드이므로 외부에서 수정가능함.
		programmer1.spec = "1종 보통운전면허";	// default 멤버필드이므로 외부에서 수정가능함.
		programmer1.displayData();
		
		// 캡슐화된 멤버를 해당 클래스 밖에서 제어하기 : getter, setter -------------------★★★
		// programmer1.age;	<<= 여기선 사용 불가능 age가 private기 때문.
		int nai = programmer1.getAge();		// public 메소드이므로 접근 가능.
		System.out.println("programmer1 객체의 age : " + nai);
		
		programmer1.setAge(31);	// publc 메소드setter를 이용해 private 필드에 값을 전달	[setter로 가져온것에 값을 조정후 getter로 읽는다]
		System.out.println("programmer1 객체의 age : " + programmer1.getAge());
		programmer1.displayData();
		
		programmer1.SetAgeEx(55, 555);	// 참고.
		
		System.out.println();
		
		System.out.println("static, final 관련 ---");
		System.out.println("motto : " + programmer1.motto);	// 사용은 가능하지만 프로그램에서 밑에 코드를 쓰라고 강요한다.
		System.out.println("motto : " + Ex2Programmer.motto);
		//static을 사용하면 클래스의 이름으로 접근한다. // static멤버는 클래스명. 멤버 형태로 접근한다.
		// programmer1.weight = 77.8; //에러 다른 클래스에서 final로 못박아 둿기 때문에 weight는 [참조]만 가능하다.
		System.out.println("WEIGHT : " + Ex2Programmer.PI);
		
		
		System.out.println("======================");
		Ex2Programmer programmer2 = new Ex2Programmer();	// 새로운 객체 생성.
		programmer2.displayData();
		
		System.out.println("객체 변수가 참조하는주소에 대해(참고용도)...");
		// System.out.println(programmer1 + " " + programmer2);
		// pack2.Ex2Programmer@3d0f8e03 pack2.Ex2Programmer@6366ebe0
		// 객체변수를 그대로 출력하면 주소가 나옴. @이 다음꺼 1진수.
		System.out.println(programmer1.toString() + " " + programmer2.toString());
		// toString 주소를 보기위한 코드. // 객체변수를 그대로 출력해도 toString이 안에 내포되어있음.
		System.out.println(programmer1.hashCode() + " " + programmer2.hashCode());
		// programmer1과 2는 이름은 비슷하지만 서로다른 객체이다. 알고만 있자. 참고.
		
		System.out.println("\n---------전문가가 만든 클래스 경험--------------------------------");
		System.out.println(Integer.MAX_VALUE);
		
		
		
		
		
		
	
	}
}
