package pack;
import java.util.Scanner;
public class Test6if {
	
	public static void main(String[] args) {			// 단순 if문
		//조건 판단문 if
		System.out.println("뭔가를 수행 후 if문 만나기");
		int num = 2;
		
		if(num >= 5) {
			System.out.println("크구나");
			System.out.println("찐짜로 크네");
		}
		
		System.out.println("\n계속1");
		
		if(num >= 5) {	// 조건이 true				// 여기 if와 else로 조건을 확인하고 값을 도출함.
			System.out.println("크구나");
			System.out.println("찐짜로 크네");
		}else {			// 조건이 false
			System.out.println("크지않네");
		}
		
		System.out.println("\n계속2");
		int jumsu = 40;
		
		if(jumsu >= 70) {
			if(jumsu >= 90) {
			System.out.println("우수");
			}else {
			System.out.println("보통'");
			}
		}else {
			if(jumsu >=50) {
			System.out.println("저조");
			}else {
			System.out.println("매우 저조");
			}
		}
		
		System.out.println("\n계속3");
		int jumsu2 = 66;
		String result = "";
		
		if(jumsu2 >= 90) {	// 다중 if문 어렵다!
			result = "수";
		}else if(jumsu2 >= 80) {
			result = "우";
		}else if(jumsu2 >= 70) {
			result = "미";
		}else if(jumsu2 >= 60) {
			result = "양";
		}else if(jumsu2 >= 50) {
			result = "가";
		}
		System.out.println("평가 결과는 " + result);
		
		System.out.println("\n계속4");
		// 어느 공원의 입장료가 8세 이하, 65세 이상인 경우 무료
		// 9세 이상 20세 미만인 3000원
		// 그 외는 5000원
		int age = 35;
		
		if(8 >= age || age >= 65) {
			System.out.println("무료");
		}
		if(9 >= age && age < 20) {
			System.out.println("3000원");
		}
		if(20 <= age || age < 65) {
			System.out.println("5000원");
		}
		
		// 윗 if문 을 다중if문으로 작성한다면 이렇게 됩니다.
		int price = 0;
		if(9 <= age && age < 20) {
			price = 3000;
		}else if(20 <=age && age < 65) {
			price = 5000;
		}else {
			price = 0;
		}
		System.out.println("입장료는 " + price);
		
		System.out.println("\n야구장에 입장하기 : 로그인에 성공 ");
		String id = "kbs";
		String password = "ok123";
		
		Scanner sca = new Scanner(System.in);
		System.out.print("id : ");
		String inputId = sca.nextLine();
		System.out.print("pwd : ");
		String inputPwd = sca.nextLine();
		
		// if(inputId == id && inputPwd == password) { 기본형 비교~~~~~~~~~~~~~~~~~~
		if(inputId.equals(id) && inputPwd.equals(password)) {
			System.out.println("로그인 성공했으므로 야구를 즐기세요~");
		}else {
			System.out.println("누구셔?");
		}
		sca.close();
		
				
		
	}

}
