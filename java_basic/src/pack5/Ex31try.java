package pack5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 예외처리 : 키보드 입력, 파일 입출력, 네트워크, DB처리 등 이러한 상황에서 외부 장치와 연결하여 사용하는 경우 자바에서 강제적으로 요구함
//			예지치 못한 장치에러가 발생할 경우 이를 방치할 목적으로 사용한다.
// 형식 : try{ } catch{ } finally{ }   <== 에러를 내가 잡아 예외로 처리함
// throws로 예외를 던져버릴수도 있다.

public class Ex31try {
	String name = "tom";
	
	public void test() {
		try {
			int a[] = {1, 2, 3};		//	collection 배열은 객체만 담을수있는 기억장소 타입.
			System.out.println("배열값 출력 : " + a[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열오류 지역이 우선함.");
		}
	}
	
	public void test2() throws Exception {
		FileReader fr2 = new FileReader("c:/wrk/kbs.txt");
	}
	
	public static void main(String[] args) {
		try {
			// 파일 작업은 강제로 예외 처리를 요구함. ★★★★★★★★
			FileReader fr = new FileReader("c:/wrk/aa.txt");
			System.out.println("aa.txt가 있네");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 읽기 오류");
		}
		
		
		try {
			int su = 0;
			int result = 10 / su;
			System.out.println("result : " + result);
			
			
			Ex31try ex31try = new Ex31try();
			//Ex31try ex31try = null;
			System.out.println("이름은 " + ex31try.name);
			
			ex31try.test();
			
			
		}
		catch (ArithmeticException e) {
				System.out.println("연산 오류 : 0 으로 나누지 마세요.");
		}
		catch (NullPointerException e) {
			System.out.println("참조변수 오류(변수가 주소를 참조하지 않네요. " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러: " + e.getMessage());
		}
		catch (Exception e) {		// 다른 익셉션과 같이 사용할때는 '익셉션'만 적힌 문구는 제일 마지막에 적어서 실행한다.
			System.out.println("위 catch 의외의 나머지 모든 오류는 여기서 처리!");
			// Exception을 가장먼저 적으면 모든 예외처리는 '익셉션'블록에서 함.
		}
		finally {		// try catch에서 finally는 에러가 발생해도 무조건 실행시킨다. 클래스 파이널과는 다르다!!
			System.out.println("에러 유무에 상관없이 반드시 수행");
		}
		
		
		System.out.println("프로그램 종료");
		
	}

}
