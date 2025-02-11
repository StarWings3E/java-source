package pack;

public class Test8for {
	
	public static void main(String[ ]args) {
		//반복문 for 1번
		System.out.println("뭔가를 하다가 ... 반복문 만나기");
		int a; 						/// for문 밖에서 선언된 a  <<< 이건 밖에서도 사용가능.
		int hap = 0;
		for(a=1; a <= 10; a += 1) { //for (변수 초기화; 조건; 증감치){ 반복내용 }
			System.out.print(a + "\t");		///  여기 안에 a는 for문에서만 정의된 a기 때문에 여기 중괄호를 나가면 a를 부를수 없다.
			// 변수가 참이면 반복문안에서 반복함. 결과값이 거짓이 되면 반복문 탈출.
			// a = 7; 반복문 내에서 for 문에 사용중인 변수는 갱신 비권장합디다.
			hap = hap + a;
		}
		
		System.out.println("\nfor문 탈출한 a : " + a);
		System.out.println("합은 " + hap);
		
		//for 2번
		System.out.println();			/// 아스키코드를 사용하여 반복문 출력.
		for(int i=65; i <= 90; i++) {
			System.out.print((char)i + " ");
		
		}
		System.out.println("\n2번 for문 탈출");
		
		//for 3번
		System.out.println();		// 아스키코드 문자를 정수 숫자로 자동치환하여 반복문으로 나열함.
		for(int i='A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n3번 for문 탈출");
		
		//for 4번
		System.out.println();		// for반복문 안에서 수치를 감소시켜서 출력.
		for(int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n4번 for문 탈출");
		
		//for 5번
		System.out.println();		// 변수가 2가지(복수) 일수도 있다.
		for(int ytn=0, tvn=5; ytn <= 5; ytn++, tvn++) {
			System.out.print(ytn + "," + tvn + " ");
		}
		System.out.println("\n5번 for문 탈출");
		
		//for 6번  --------------------단순 반복(축약 버전)
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++) {
			System.out.print(aa + " ");
		}
		System.out.println("\n6번 for문 탈출");
		
		//for 7번 -------------------for문 안에 if작성 가능. 반대도 가능함. 블럭은 블럭을 '포함'할 수 있다!!
		System.out.println();
		for(int sbs = 1; sbs <= 10; sbs++) {
			if(sbs % 2 == 0) {
				System.out.print(sbs + " ");
			}
			if(sbs == 6) break; // if문을 이용해서 반복도중에 값 탈출시키기 ★★★
		}
		System.out.println("\n7번 for문 탈출");
		
		//for 8번 -----------다중 for문 진짜 중요..
		System.out.println();
		for(int m=1; m <= 3; m++) {
			System.out.println("m:" + m + " ");
			for(int n=1; n <= 4; n++) {		// 여기서 n의 가지고 있는 for문을 모두 실행하며 한번 반복마다 위에 m과 충돌하며 값을 도출.
				System.out.print("n=" + n + " ");	// 위에 m은 1< <3 까지의 범위기 때문에 n은 3번의 반복을 해야함.
			}
			System.out.println(); // 여기 빈칸들어가는거 다시 디버깅 해봐 이거 머리 아프네..
		}
		System.out.println("\n8번 for문 탈출");
		
		//for 9번 ---------------------------------이거 해석되면 for문 뜯어먹기 완성임
		System.out.println();
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for(char j=i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n9번 for문 탈출");
		
		System.out.println("\n예제");
		// 문1) 구구단 3단 출력
		for(int dan=1; dan < 10; dan++) {
			System.out.println("3X" + dan + " = " + (3 * dan));
		}
		
		// 문2 : 2~9 단 까지 출력
		// 2*1=2 2*2=4 ... 2*9=18
		// ...
		// 9*1=9 9*2=18 ... 9*9=81
		System.out.println("\n예제2");
		
		for(int m=2; m <= 9; m++) {
			for(int n=1; n <= 9; n++) {		
				System.out.print(m + "X" + n + "=" + (m * n) + " ");
			}
			System.out.println();
		}
		
		
		// 문3 1~100 사이의 정수 중 3의 배수이면서 5의 배수를 출력하고, 건수와 그들의 총합을 출력
		System.out.println("\n예제3");
		int gun = 0;
		int su = 1;
		int to = 0;
		
		for(; su <= 100; su++) {
			if(su % 3 == 0 && su % 5 == 0) {
				System.out.print(su + " ");
				gun ++;							// ----------- for문에서 결과 출력해서 카운팅 하는법 ★★★★★
				to += gun;
			}
			to = to + su;
		}
		System.out.println("\n개수는 : " + gun);
		System.out.println("총합은 : " + to);
		
		//----------------------------------------------------------------2025-01-20----------------
		System.out.println();
		System.out.println("continue, break ---");
		int i =1;
		for(; i <= 10; i++) {
			if(i == 3 || i == 5) continue;	// 자기와 대응대는 for문으로 무조건 이동
			//if(i == 5) continue;
			System.out.print(i);
			if(i == 7) break;
		}
		System.out.println();
		// 한무반복문 ( loop문 )
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("kk");
			if(kk == 5)break;
		}

	}

}
