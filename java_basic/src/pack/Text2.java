package pack;

//////////////////////////////////////////////////////// 2025-01-15
public class Text2 {
	public static void main(String[] args) {
		// 주석 실행과는 무관한 설명을 달기 위해 사용함.
		/*
		 * 여러줄 주석
		 * 실행과는 상관이 없음
		 */
//		ctrl+/ 누르면 한줄전체 주석변환 단축키.
		String irum = "신기해"; // 문자열을 변수에 기억
		System.out.print(irum); // 계속 이어서 출력
		System.out.println(irum); // ln 은 라인 스킵후 출력
		System.out.print(irum);
		System.out.println(); // syso 작성 후 ctrl+스페이스바  << 단축키
		
		// 변수 : 값(데이터)을 저장할 수 있는 메모리 공간(새로운 값을 입력하면 덮어쓰기됨)
		// 변수명 : 변수에 대한 임의의 이름. 형식 : 타입 변수명 = 리터럴(문자, 숫자 ...)
		// 상수 : 처음에 입력한 값이 계속 유지되는 메모리 공간
		
		// 변수 기본형 타입 : bcbsilfd
		// 기본형 처럼 사용하는 참조형 타입 : String
		
		// byte type
		byte var1; // 1바이트(-128~127) 정수 기억장소
		var1 = 10;
		var1 = 5;	// 이전값 덮어씌우기
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		byte var2 = 123;	// =는 대입 연산자(또는 치환 연산자)
		// var2 = 128; 바이트의 범위를 넘어서 안됨
		System.out.println("var2:" + var2);
		
		System.out.println();
		// short type
		short var3 = 10; // 2바이트(-32768 ~ 32767) 정수 기억장소
		//var3 = 32768;  << 범위를 벗어나서 안됨 (위에 short이라고 정의해 놓았기때문)
		System.out.println("var3:" + var3);
		
		System.out.println();
		// int type
		int var4 = 10; // 4바이트(~약 20억) 정수 기억장소
		var4 = 32768;	// 정수는 int 무조건 int 이게 자바 정실인듯. 그냥 숫자 다들어감 ㅇㅇ
		System.out.println("var4:" + var4);
		
		System.out.println();
		
		System.out.println("형변환에 대해서...");
		byte aa = 10;	// 모든 정수는 int인데 aa=10;에서 알아서 형변환을 적용함. (int타입의 10을 byte type으로 자동 형변한 후 기억)
		// '자동' 형변환을 프로모션(promotion)이라고 함.
		aa = (byte)10;	// '강제' 형변환(cast 연산자르 ㄹ이용해 casting 함)★★★
		int imsi = 7;
		byte bb = 7;
		byte cc = (byte)imsi;	// 정의를 해줘야함. 왜냐하면 byte의 집합과 int의 집합이 동이 하지 않은데 int값을 무리하게 byte로 집어넣을수 없기에 오류남.
		System.out.println("(강제형변환)aa:" + aa);
		System.out.println("bb:" + bb);
		System.out.println("cc:" + cc); // 위 주석을 읽어 보면 여기가 이해됨.
		
		// long
		long var5;	// 8바이트 정수 기억장소
		var5 = 10;
		var5 = 2147483648L;	// 앞에 뭐라고 적어준게 없기때문에 int을 수를 계산함.(2147483648은 int값을 넘는 숫자) 오류가 날수 밖에없음.
		// long타입이 int보다 범위가 넓음. 자바의 기본 숫자 값은 int것을 생각하자.
		System.out.println("var5:" + var5);
		
		System.out.println();
		
		System.out.println("실수에 대해서...");
		float f1 = 3;	// 실수형 기억장소(4byte)
		// 정수는 실수로 자동 형변환 (promotion)
		// 숫자인데 소숫점이 없으면 int, 숫자에 소숫점이 있으면 dobble  ★★ 왜냐! 기본이 int니까 소숫점은 기본으로는 사용못함. 정의 해줘햐함.
		// f1 = 123.12;	err
		f1 = 123.12f;	//123.12F < float type의 데이터 << 위에 long했던것 처럼 위에 정의해줄수 있는 문자 입력해주면 사용가능함.
		System.out.println("f1 :" + f1);
		
		double d1 = 123; // 실수형 기억장소(8byte) : 소수이하 15자리 정밀도 보장
		d1 = 123.12;
		System.out.println("d1 :" + d1);
		
		// int aa1 = 3,5;	// err
		int aa1 = (int)3.5;	// int 강제 정의할시 소수이하 버리고 정수만 기억함.
		System.out.println("aa1 :" + aa1);
		
		// aa2 = (int)(10.6 + 12.6);       = aa2의 값은 23
		// aa2 = (int)10.6 + (int)12.6;	   = aa2의 값은 22
		// 위에 두개의 값은 다르다 언제 int를 정의해서 소숫저을 버리는지 잘 계산해줘야 함. 
		
		double aa3 = 12 + 10.5;	// 정수(소숫점까지도)는 실수화 후 연산에 참여  (그냥 더블이 미친놈인데?)
		System.out.println("aa3 :" + aa3);
		
		////////////////////////////////////2025-01-16
		System.out.println("논리형(boolean, 참 또는 거짓 결과의 자료형)에 대해...");
		boolean bu1 = true;
		bu1 = false;
		System.out.println("bu1 :" + bu1);
		
		System.out.println("문자형(char, 한개의 문자 기억)에 대해...");	// 아스키코드 알아야됨 여기 단순 암기과목. 알면 좋은 과목 필수 아님. 몰라도 돼.
		char c1 = '0';
		// c1 = 'bc';
		// c1 = "b"; 	<< 불가능.
		System.out.println("c1 :" + c1 + " " + (int)c1 + " " + (char)97);
		// ascii 코드에서 'A'는 십진수 65, 'a'는 97 , '0'은 48 , 엔터는 10 or 13
		
		System.out.println("안녕" + (char)10 + "반가워");
		int abc = 0x0f;	 // 16(0x리터럴)진수를 10진수로 int 형으로 저장
		System.out.println("abc :" + abc + " " + Integer.toHexString(15));
		System.out.println("abc :" + abc + " " + Integer.toBinaryString(15));
		int abc2 = 007;	 // 8(0리터럴)진수를 10진수로 int 형으로 저장
		System.out.println("abc2 :" + abc2);
		
		System.out.println();
		final double PI = 3.14;	// 고정값을 만들고 싶을때 변하지 않아야 하는 값을 만들 때. [final 사용할땐 이름은 무조건 (대문자)로 작성]
		// PI = 5.6; 위에서 final을 사용 했기 때문에 err가 난다. 수정불가!
		System.out.println("PI :" + PI);
		
	}
}
