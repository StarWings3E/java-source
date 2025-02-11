package pack4Extands;

public class Ex12Father extends Ex12GrandFa {
	private final int nai = 50; // final 수정불가.
	// Gajok클래스에서 아버지 나이를 찍어도 할아버지 클래스의 상속을 받고있고 할아버지 클래스에서 할아버지의 나이만 출력하고있기때문에 소용없다.
	public String gabo = "고려청자 비스므리한 물병";	// 
	private int house = 1;
	
	
	public Ex12Father() {
		super(88);
		System.out.println("아버지 생성자");
	}
	
	@Override		// annotation (뭔가를 처리하는 기능) @뒤에 글자 적혀있는 친구 주석이 아니고 뭔가 하는놈임.
	public int getNai() {
		// 메소드 오버라이딩 : 부모와 똑가은 메소드를 자식에서 만듬.
		int imsi = 0; // 부모와 다른 코드를  적을 수 있다. [재정의]
		return nai;
	}
	
	@Override
	public void say() {
		String ss = "아빠 말씀 : 풀스택 개발자 가즈아~";
		System.out.println(ss);
	}
	
	public int getHouse() {
		return house;
	}
	
	public void showData() { 
		String gabo = "맥북";
		System.out.println(gabo);		// 제일 가까운 변수를 찾아 출력.
		System.out.println(this.gabo);	// 현재 클래스의 변수를 찾아 출력.
		System.out.println(super.gabo);	// 상속된 클래스의 변수를 찾아 출력.
		
		say();
		this.say();
		super.say();
		
	}

}
