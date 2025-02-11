package pack4Extands;


// 내부 클래스
// 클래스의 멤버로 필드, 메소드 외에 클래스를 가질수있다.이를 내부 클래스라고 한다.
// 클래스내에서 다른 클래스 객체를 사용해야 하는 경우가 잇다. 이때 구현하면 효과적.
// 참고로 클래스는 하나는 하나의 '익스텐드'extends 문을 가지고 있다는 점을 기억하자.!!


public class Ex27Outer {
	private int kor;
	private Inner inner;
	
	public Ex27Outer() {
		kor = 10;
		inner = new Inner();	// 내부 클래스도 객체생성은 포함관계처럼 생성가능하다.	<< 다른 클래스에서 불러오는거 마냥 정의한후 inner쩜 찍고 사용.
		
	}
	
	public void aa() {
		System.out.println("외부 클래스 Other의 aa메소드 이다.");
		System.out.println("kor : " + kor);
		inner.cc();
		System.out.println("eng : " + inner.eng);
		
	}
	
	private void bb() {
		System.out.println("외부 클래스 Other의 [bb]메소드 이다.");
	}
	
	
	// 내부 클래스 선언!
	public class Inner {	// 이 클래스는 상위에 Ex27Other클래스 만을 위한 클래스임.
		private int eng;
		
		public Inner() {
			eng = 20;
		}
		
		public void cc() {
			System.out.println("내부 클래스 Inner의 cc 메소드");
			bb(); 		// 여기 내부클래스를 품고있는 클래스의 bb메소드. / 외부클래스가 내부클래스를  품고잇으니 내부클래스에서 그냥 불러도 문제 없음.
			
			System.out.println("내부 eng: " + eng + ", 외부 kor: " + kor);
			// 그냥 불러지잖아~ ㅋㅋ
			
		}
		
		// 내부 클래스안에 내부클래스 만들수는 있지만, 권장하지 않음. (마트료시카클래스 하지 말래ㅋㅋ)
		
	}
	
	
	
	public static void main(String[] args) {
		Ex27Outer outer = new Ex27Outer();
		outer.aa();
		outer.bb();
		
		//Inner inner = new Inner();	// 내부 클래스는 독립적인 객체 생성 불가능!!
		//Ex27Outer.Inner inner = outer.new Inner();	// 이거 가능한데 이렇게 사용하지는 않는다!! ㅋㅋ비권장
		//inner.cc();
		
		System.out.println();
		
		
		
	}

}
