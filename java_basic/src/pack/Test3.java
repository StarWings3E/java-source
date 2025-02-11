package pack;

public class Test3 {
	public static void main(String[] args) {
		//산술 연산자
		int a = 5;	// =(대입연산자) a 변수에 리터럴 5를 기억시킴
		int b = 3;	
		int c = a + b;	// 여기가 산술 연산자.
		
		System.out.println(c);
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + (a * b));
		System.out.println("a / b : " + (a / b));	// 몫
		System.out.println("a % b : " + (a % b));	// 나머지
		System.out.println("a / (double)b : " + (a / (double)b));	// 몫과 나머지
		
		System.out.println();
		// System.out.println(a / 0);	<<<<<<<<<<<< runtime error(실행오류) 
		// 에러를 만나면 강제종료로 인해서 밑에 "끝"이라는 글자가 출력안됨
		System.out.println(a / 0.0);	// Infinity(무한대)
		System.out.println(a % 0.0);	// NaN(not a number) 숫자가 아니라서 숫자로 표현할 수 없을때 사용.
		
		System.out.println("산술 연산자 우선순위");
		System.out.println(3 + 4 * 5);
		System.out.println((3 + 4) * 5);
		
		System.out.println("문자열 더하기");
		String ss1 = "대한";	// String은 기본형이 아니라 참조형 변수임. 사용방법은 기본형 처럼 같다.
		String ss2 = "민국";
		System.out.println(ss1 + ss2);	// 이때는 문자열 더하기. 더하기만 가능함. 다른 부호는 사용 불가.
		System.out.println(ss2 + " " + 2025);	// 2025정수는 문자열로 자동 형변환 후 문자열더하기 적용.
		System.out.println(ss2 + " " + 2000 + 25);
		System.out.println(ss2 + " " + (2000 + 25));	// 이거 할줄 모르고 저 위에 이미 사용햇는데 바로 배우네;;
		
		String ss3 = "5" + 6;	// 여기서 큰따옴표(")안둘럿으면 숫자 취급으로 string열에서 취급하지 않기에 err.
		System.out.println("ss3 : " + ss3);
		
		System.out.println("5" + 6);
		System.out.println(Integer.toString(5) + 6);	//윗 줄과 동일한 뜻임.
		
		System.out.println(5 + 6);
		System.out.println(Integer.parseInt("5") + 6);	//윗 줄과 같은 뜻임.
		
		System.out.println("누적");
		int no = 1;
		no = no + 1;
		no += 1;	// "누적" 윗줄과 같은 뜻임 // no -= 1 , no *= 2 , no /= 2
		no++;	// 증강 연산자 (후위)	no--; // 이건 1씩밖에 안됨 위에껀 숫자 바꾸면 1초과의 숫자를 대입가능.
		++no;	// 증강 연산자 (전위)
		System.out.println("no : " + no);
		
		System.out.println();
		
		int imsi = 5;
		int result = ++imsi + 1;	// 증강연산자 전위사용 (증강++을 한후 연산을 시작하여 결과값을 도출.)
		System.out.println("imsi : " + imsi);
		System.out.println("result : " + result);
		
		System.out.println();
		
		int imsi2 = 5;
		int result2 = imsi2++ + 1;	// 증상연산자 후위사용 (증강++은 사용하지않고 연산을 시작한 후 결과도출 그 뒤 증강을함.)
		// 규칙이야 그냥 알고만 잇자... 필요없어보여도 알곤 있어야할꺼같다.
		System.out.println("imsi2 : " + imsi2);
		System.out.println("result2 : " + result2);
		
		System.out.println();
		
		System.out.println("부호에 대해");
		int imsi3 = 7;
		System.out.println("imsi3 : " + imsi3);
		System.out.println("imsi3 : " + -imsi3);	// 변수앞에 -를 붙히거나 -1을 붙히면 음수가 됨.
		System.out.println("imsi3 : " + (-1 * imsi3));
		int imsi4 = -1 * imsi3;
		System.out.println("imsi4 : " + imsi4);
		
		
		System.out.println();
		System.out.println("여기까지가 산술연산자" + (char)13 + "및 기타 \n 연습 끝");
		
	}
}
