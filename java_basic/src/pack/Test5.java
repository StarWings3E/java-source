package pack;
import java.util.Scanner;	// 사용할 이름 미리 가져와서 정의해놓기 그래야 사용가능.

public class Test5 {

	public static void main(String[] args) {
		System.out.println("출발");
		//aa();	// aa 묶음 호출 <<< 반환값이 void일때 사용가능.
		boolean bbb = aa();
		System.out.println(bbb);
		
		System.out.println("끝");

		System.out.println("\n논리 연산자 처리할 때 주의 할 점.");	// ★★★★★ㅁ8★ㅁ8★ㅁ8ㅁ8ㅁ중요
		boolean a = true, b = false, c;
		
		c = a || b;	// 둘중 하나만 참이면 통과
		System.out.println("c는 " + c);
		c = a && b;	// 둘다 참이여야 통과
		System.out.println("c는 " + c);
		
		System.out.println();
		
		System.out.println("**************");	// 하드하게 데이터 걸러내서 실행.
		c = abc() || def();
		System.out.println("묶은 수행 후 c는 " + c);
		System.out.println();
		c = def() || abc();
		System.out.println("묶은 수행 후 c는 " + c);
		
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~");
		c = abc() && def();
		System.out.println("보따리 수행 후 c는 " + c);
		System.out.println();
		c = def() && abc();
		System.out.println("보따리 수행 후 c는 " + c);
		
		System.out.println("*****모두 수행하기~~~~~~~~~");	// 하드하게 아무것도 걸러내지않고 실행시키기
		c = abc() | def();
		System.out.println("묶은 수행 후 c는 " + c);
		System.out.println();
		c = def() | abc();
		System.out.println("묶은 수행 후 c는 " + c);
		System.out.println();
		c = abc() & def();
		System.out.println("보따리 수행 후 c는 " + c);
		System.out.println();
		c = def() & abc();
		System.out.println("보따리 수행 후 c는 " + c);
		
		System.out.println();
		
		System.out.println("좀 다른 얘기를 실습 : 키보드 (표준입력장치)로 값 받기");
		inputTest();
		
		
	}
	
	//public static void aa() {	// 독립적, 반복적으로 실행되는 코드를 다른 클래스안에 별도 작성.
	public static boolean aa() {	// aa 처리 후 돌아갈때 boolean 값을 가지고 감. 반환값

		System.out.println("아자");
		// System.out.println("아자2");
		return true;
		
	}

	public static boolean abc() {
		System.out.println("abc 출력, 한 줄 수행했지만 abc는 여러 행으로 구성된다고 가정");
		return true;
		
	}
	
	public static boolean def() {
		System.out.println("def 출력");
		return false;
		
	}
	
	public static void inputTest() {
		String ir = "손오공" ;
		int nai = 22;
		System.out.println(ir + "님의 나이는 " + nai);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);	// 키보드를 이용하여 값 불러오기 스캐너.
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println(name + "씨의 나이는 " + age);
		
		sc.close();
		
		
		
		
		
	}
}
