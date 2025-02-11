package pack3;

public class Ex11Main {

	public static void main(String[] args) {
		// book 객체 생성.
		Ex11Book myBook = new Ex11Book("자바 클래스 활용", "박chigi");
		
		// student 객체를 성성
		Ex11Studunt tom = new Ex11Studunt("미스터 톰", myBook);
		tom.showStudentDetail();

	}

}
