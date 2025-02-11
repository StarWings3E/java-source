package pack4Extands;

public class Ex12GrandFa {
	private int nai = 70;
	public String gabo = "고려청자";
	protected String gahun = "차카게 살자";
	// protected 는 디폴드와 다르게 다른 패키지에 있어도 참조 할수있다. 조건이 있다.
	// 조건은 상속받는 아들만 참조가 가능하다. 자식이 아니면 참조 불가능.
	
	
	public Ex12GrandFa() {
		System.out.println("할아버지 생성자");
	}
	
	public Ex12GrandFa(int nai) {
		this();
		this.nai = nai;
	}
	
	public void	say() {
		System.out.println("할아버지 말씀 : 자바에 집중해라~");
	}
	
	public void eat() {
		System.out.println("밥은 마싯게 먹어라~");
	}
	
	public int getNai() {
		return nai;
	}

}
