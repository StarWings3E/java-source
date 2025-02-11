package pack;
import java.util.Scanner;
public class Test9while {

	public static void main(String[] args) {
		// while문  --- for문과 다른점은 for문은 반복횟수가 정해져있을때 많이쓰고 while은 무한반복할때 많이 쓴다.
		// 반복문while : while(조건) {반복 처리 대상 ...}
		int w = 1; // while문은 밖에서 변수정의를 해주고 들어가야함. 조건이 무조건 참으로 해줘야함.
		
		while(w <= 5) {
			System.out.print("w : " + w  + " ");
			w += 1;		// 조건을 증가시켜주는 문장을 적지 않으면 while에서는 정의도니 숫자만 반복한다.
			// while은 조건이 참일때 반복을 하기 때문에 조건이 거짓이 되는 문장을 적어야한다. [[필수]]
		}
		System.out.println("\n탈출 후 w : " + w);		// 조건문 실행 후 값을 얻고 싶으면 while나와서 값을 불러주면 완료값을 가져온다.
		
		System.out.println();
		int count = 0;
		while(count < 10) { // while (10 > count)
			count++;	// ++count, count +=1, count = count + 1  // 1씩 증가하는 문장 다 똑같다.(자바 한정으로.)
			System.out.println("count:" + count);
			if(count == 10) {
				System.out.println("count가 10이라서 반복문 종료:" + count);
			}
		}
		
		System.out.println("\n다중 while ------"); // 반복문안에 반복문 = 다중반복문
		int a =1;
		while(a <=3) {
			System.out.println("a:" + a);
			int b =1;
			while(b <=4) {
				System.out.print("b=" + b);
				b++;
			}
			a++;
			System.out.println();
		}
		
		
		System.out.println("do while ------");
		int m = 0;
		do {	// 조건이 밑에 적고 사용. 최소 1회는 '반드시' 실행.
			System.out.println("do while의 m:" + m);
			m++;
		}while(m <=5);
		System.out.println();
		System.out.println("continue, break -----");
		int x = 0;
		while(x <=10) {
			x = x + 1;
			if(x == 3) continue;
			if(x == 7) break;
			System.out.print("x:" + x);
		}
		
		System.out.println("\n무한 루프(looping)");
		int y = 1;
		while(true) { 	// while에 참이라고 정의해줫기 때문에 '참'인경우 반복문을 실행하는 while문은 브레이크를 만나기 전까지 반복할수밖에 없다.
			System.out.println("y:" + y);
			y++;
			if(y == 5) break;
		}
		
		System.out.println();
		System.out.println("문 : 1~10 사이의 정수중 짝수만 출력하고 그 갯수도 출력.");
		int q = 1;
		int con =0;
		while(q <= 10) {
			if(q % 2 == 0 ) { 	// 짝수 출력 ★★★
			System.out.print(q + " ");
		
			con++;	
			}
			q++;	// int q = 0; 부터 출발시킬꺼면 q++; 을 while시작 하자마자 숫자를 찍어줘서 1부터 시작하게끔 해야함. 서순이 있음
		}
		System.out.println("\n짝수의 개수는:" + con);
		
		System.out.println();
		
		// System.exit(0); 	// 참고하세요 - 현재 실행 중인 프로그램 강제로 종료
		
		System.out.println("문 : 키보드로 정수를 입력받아 1부터 그 수까지의 합을 출력");
		// 조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정
		
		Scanner sc = new Scanner(System.in);
		while(true) { // 무한 반복 break를 만날때 까지... for(;;) 안씀 
			System.out.print("양의 정수를 입력 : ");
			int num = sc.nextInt();
			//System.out.println(num);
			if(num <=1) {	// 1 이하의 값이 입력되면 작업 종료
				System.out.println("2 이상이 정수를 입력하세요");
				break;
			}
			// 1부터 해당 숫자 까지의 합 출력
			int n=1, total=0;
			while(n <= num) {	// 키보드에서 입력한 숫자 보다 작은숫자동안 반복.
				total += n;
				n++;			// 또나왓다 반복한 값에 대한 총합구하기!
			}
			System.out.println("합(total)은? : " + total);
			
			System.out.print("계속할까요(1긍정/0부정)? : ");
			int imsi = sc.nextInt();
			if(imsi !=1) { // 코드앞에 ex)if(!imsi.equals("y")) << !표 붙혀주면 부정이 됨.
				System.out.println("\n작업 종료");
				break;
			}

		}
		
		sc.close();

	}

}
