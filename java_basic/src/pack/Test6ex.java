package pack;

import java.util.Scanner;

public class Test6ex {

	public static void main(String[] args) {
		// 키보드로 상품명, 수량, 단가를 받아 나열하시오.
		// 금액 : kum, 세금 : sekum , 상품명 : String sang , 수량 : int su , 단가 : int dan
		// 상품명 마우스는 금액:5000원이고 세금은 500원
		// 조건 : 금액은 수량*단가
		// 세금은 금액이 5만원 이상이면 금액의 10%(0.1 곱하면됨), 3만원이상이면 금액의 5%(0.05 곱하면됨), 나머지는 금액의 3%(0.03)
		// 출력은 상품명 + 금액 + 세금 으로 나타내기.
		System.out.println("상품 검색");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("상품명 : ");
		String sang = scan.next();
		System.out.print("단가 : ");
		int dan = scan.nextInt();
		System.out.print("수량 : ");
		int su = scan.nextInt();
		
		double sekum = 0;
		int kum = su * dan;
		
		if(50000 <= kum) {
			sekum = kum/10;
		}else if(30000 <= kum){
			sekum = kum/5;	
		}else {
			sekum = kum/3;
		}
		System.out.println("상품명" + sang + "의 금액은" + kum + " 세금은 " + sekum + "원");
	
		scan.close();
		
		
	}

}
