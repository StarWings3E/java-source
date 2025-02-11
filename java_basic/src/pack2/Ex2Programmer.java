package pack2;

public class Ex2Programmer {
	public String nickName;	//초기 값이 없으면 참조형이므로 null이 됨.
	private int age;	// 초기값이 없으면 0을 기억함. <<= 이 클래스에서만 사용가능함. "은닉화" 되어있는 필드.
	//private int age = 0;	// 위와 같은 의미.
	String spec = "정보처리 자격증"; // 앞에 public없지만 defualt를 내포하고 잇음
	
	
		// 은닉화 : 불필요한 정보를 숨기는 것 
		// 캡슐화 : 데이터와 메소드를 하나로 묶는 것
		// ## 캡슐화는 은닉화를 구현하는 가장 기본적인 방법.

	
	public Ex2Programmer() {
		// 생성자는 내용이 없는 경우에 적지 않으면 컴파일러가 내부적으로 만들어온다.
		System.out.println("난 생성자야. 객체 생성시 1회만 호출가능.");
		int number = 20;		// 지역변수 (메소드 내에서 선언한 변수는 메소드 내에서만 유효)	잊지말자! ★★★★★
		age = number + 5;
		nickName = "에러잡는귀신";
	}
	
	public void displayData() {
		System.out.println("---");
		String mySpec = responseSpec();		// 메소드가 다른 메소드를 호출;;;
		System.out.println(mySpec);
		
		System.out.println("별명: " + nickName + ", 나이는 " + age);
		System.out.println("---");
	}
	
	private String responseSpec() {
		return "내가 가진 기술은 " + spec;
	}
	
	
	// private 멤버 외부에서 제어하기 위한 public 메소드
	public int getAge() {	//메소드 이름은 약속. get멤버변수(멤버변수 첫글자는 대문자) <-------getter메소드 ★★★
		return age; // age변수 자체를 반환하는 것이 아니라 age에 기억된 정수를 반환
	}
	
	public void setAge(int age) {	//메소드 이름은 약속. set멤버변수(멤버변수 첫글자는 대문자) <-----setter메소드 ★★★
		this.age = age;
	}
	
	public void SetAgeEx(int age, int password) {
		if(password == 123) {
			this.age = age;
			System.out.println("age 수정 성공!");
		}else {
			System.out.println("비밀번호가 틀리므로 age를 수정할 수 없어요.");
		}
		
	}
	
	public static String motto = "자바에 아름답게 미치다!"; // 정적필드, static
	// static 멤버는 객체변수 이름으로 호출이 가능함.
	public final double WEIGHT = 66.8;		// final 수정불가 값을 고정하는 절대적인 코드. 다른 곳에선 이것은 참조만 가능하다...
	public static final double PI = 3.14;	// 정적 필드이고 수정 불가.. // 이름은 대문자로만 쓰는걸 권장함.
	// 여기 public, static, final 서순은 바꿔도 된다고 합니다.	
	
	
	
	
	
	
	
	
}
