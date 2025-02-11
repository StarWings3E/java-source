package pack4Extands;

public class Ex16DogMain {

	public static void main(String[] args) {
		Ex16Dog dog = new Ex16Dog("개");
		dog.print();
		System.out.println(dog.callName());
		
		System.out.println();
		Ex16HouseDog houseDog = new Ex16HouseDog("집개");
		houseDog.print();
		System.out.println(houseDog.callName());
		houseDog.show();
		
		System.out.println();
		Ex16WolfDog wolfDog = new Ex16WolfDog("늑대");
		wolfDog.print();
		System.out.println(wolfDog.callName());
		wolfDog.show();
		
		System.out.println("----------------------");
		Ex16WolfDog bushdog = wolfDog;		// 주소를 치환 ( 타입이 같은 경우 치환 성공.)
		wolfDog.print();
		bushdog.print();	// 같은 녀석이다.
		
		
		// promotion 프로모션
		// 부모가 가지고 있는 메소드를 자식에서 오버라이드한 메소드는 부모에서 사용가능하다.(조건부)
		// 그것이 '프로모션'
		Ex16Dog dog2 = wolfDog;				// 주소를 치환 ( 타입이 다른데도 불구하고 치환 성공. - 자식의 주소를 부모 객체변수에 주는경우)
		dog2.print();				// 오버라이딩된 메소드만 부모 객체 변수명으로 호출가능...
		//dog2.show();				// 자식이 가진 고유 메소드는 호출 불가능!!
		//Ex16WolfDog hidog = dog2;	// 타입 미스매칭. 자식 메소드를 부모메소드와 같게 만들걸 '다른 자식 메소드'에 연결을 실패!!!!
		
		Ex16WolfDog hidog = (Ex16WolfDog)dog2; // 캐스팅!!!!!!!!!!!!!!	위에서 실패한 연결을 앞에 '강제로'변환 시켜주니 사용 가능!!
		hidog.print();
		
		System.out.println("-----------------");
		Ex16Dog coyote = new Ex16Dog("코요테");			// dog 부모 클래스
		coyote.print();
		System.out.println(coyote.callName());
		
		Ex16WolfDog wolfDog2 = new Ex16WolfDog("늑대2");	// dog의 자식 클래스
		wolfDog2.print();
		wolfDog2.show();
		
		coyote = wolfDog2; 	// 프로모션~ : 자깃 개겣 주소를 부모 객체변수에 치환.
		coyote.print();		// 오버라이딩 된 메소드는 불러올수있음~~!!!
		//coyote.show();	// 고유메소드는 안된다.
		
		Ex16WolfDog wolfDog3 = null;
		wolfDog3 = wolfDog2;	// 같은 울프독 이라서 치환 가능!
		//wolfDog3 = houseDog;	// 같은 주소(타입)가 아니라서 치환 불가능!!
		wolfDog3 = (Ex16WolfDog)coyote;		// 이럴경우 (강제) 캐스팅하면 사용이 가능해짐! 캐스팅으로 치환 가능!! ★★★★★★★★
		// 윗코드와 같게 타입이 달라서 치환 불가능. 하지만 부모타입인 '코요테'는 자식의 주소를 알고있음.
		
		
		
		
				
		

	}

}
