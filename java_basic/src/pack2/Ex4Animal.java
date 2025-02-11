package pack2;

// method overloading : 클래스 내에 동일 이름의 메소드를 복수로 만듬.
public class Ex4Animal {	// 동물이 가져야할 속성(field)과 행위(method)를 클래스로 설계
	private int leg = 4;	
	private int age;		// 전역변수를 설정했다는 뜻은, 이제 여기 하위로 오는 모든 메소드에서 이 변수를 쓰겟다는 말.
	private String name;	// 기본값은 int는 '0' , String은 'null'
	public final static int MOUTH = 1;
	
	public Ex4Animal() {
		// 내용이 없는 생성자는 내용을 안적으면 컴파일러가 자동으로 만들어 줌.
		System.out.println("내용이 없는 생성자");
		
	}
	
	public Ex4Animal(int leg) {	// 생성자 오버로드... 1)
		this.leg = leg;
		System.out.println("정수 1개를 받는 생성자");
	}
	
	public Ex4Animal(String name, int age) {	// 생성자 오버로드... 2)
		this.name = name;
		this.age = age;
		System.out.println("2개의 매개변수를 받는 생성자");
	}
	
	public void display() {
		System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
	}
	
	//오버로딩 성립조건.   --------------------------------------------------------------------------
	//매개변수의 개수, 순서, 타입이 다르면 됨.
	public void display(int age) {	// 메소드 오버로딩~~ : 타입을 넣어준다면 윗 코드랑은 달라짐(성립한다)! 이거시 오버로딩.
		this.age = age;
		System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
	}
	
	public void display(String name) {	// 메소드 오버로딩 : 타입성질이 다르면 가능~
		System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
	}
	
	public void display(int age, String name) {	// 메소드 오버로딩 : 타입이 두개라도 가능!
		System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
	}
	
	public void display(String name, int age) {	// 메소드 오버로딩 : 타입의 순서가 달라도 가능!
		System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
		
		
	}
	
	/*public void display(int leg) {	// 메소드 오버로딩 : 타입이 같고 변수명이 다른경우, 타입이 같기때문에 변수를 확인할수 없어 불가능. 이미 위에 int age 썻잖아.
	 *	System.out.println("leg: " + leg + " , age: " + age + " , name: " + name);
	}*/
	
	
}