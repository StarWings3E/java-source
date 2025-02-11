package pack2;


public class Ex2Student {
	
	//Ex2Student
	//문제 1 : 학생 정보 관리 클래스. 학생 정보를 관리하기 위한 Student 클래스를 작성
	//클래스는 Student입니다. 다음 필드를 포함한다.
	//String name (학생이름), int grade (학년), double score (평균 점수)
	//생성자는 모든 필드를 초기화 할 수 있어야 합니다.
	//학생의 정보를 출력하는 printStundentInfo() 매서드를 작성
	//출력 형식은 다음과 같습니다.
	//이름: [name], 학년: [grade], 평균 점수: [scroe]
	//main 메서드에서 학생 객체를 생성하고 printStudentInfo() 매서드를 호출하세요

	public static void main(String[] args) {		// 생성자는 처음에 한번만 주면된다.
		Student gill = new Student("홍길동", 5);
		gill.setScroe(66.6);
		gill.printStudentInfo();
		
		Student tom = new Student("톰", 77);
		tom.setScroe(88.8);
		tom.printStudentInfo();
		
		//main.name = "Java Cord";  << private라서 사용이 안됨.
		//main.grade = 25;
		//main.setScroe(77.7);
		//main.printStudentInfo();
		
		
		

	}

}
