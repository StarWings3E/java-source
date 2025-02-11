package pack_etc;

import pack2.Ex5Bank;	// 다른 패키지의 클래스를 읽으려면 import를 사용
import pack2.*; // 그 패키지안에 있는 모든 클래스를 가져오지만 그만큼 메모리를 잡아먹음. 비권장합니다.

import java.math.BigDecimal;
import java.lang.System;

public class Ex5BankMain2 {

	public static void main(String[] args) {
		
		Ex5Bank bank1 = new Ex5Bank();
											// 또 다른 패키지에서 실행 기준
		//System.out.println(bank1.imsi);	// default 수준 이므로 멤버접근 '불가능' 
		// << 같은 패키지안 다른 클래스의 호출에선 사용 가능했지만 다른 패키지에서는 불가능.
		System.out.println(bank1.imsi2);	// public 수준 이므로 멤버접근 '가능'
		//System.out.println(bank1.money);	// 당연하게도 private 수준은 멤버접근 '불가능'
		
		System.out.println(BigDecimal.ONE);
		
		
	}

}
