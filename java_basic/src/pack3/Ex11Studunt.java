package pack3;

public class Ex11Studunt {
	private String name;
	//private Ex11Book book = new Ex11Book(name, name);		// 난 외부에서 값을 가져올꺼다 이거 안써.
	private Ex11Book book;	// 클래스의 포함관계 << 외부에서 값을 가져옴.
	
	public Ex11Studunt(String name, Ex11Book book) {
		this();			// 생성자는 다른 생성자를 호출 할 수 있다.  호출한다면 다른 호출보다 먼저 호출해야한다.
		// this() 괄호안에 뭘 넣냐에 따라서 다른 생성자를 선택해서 부를수 있다.
		this.name = name;
		this.book = book;
		
	}
	
	public Ex11Studunt() {
		System.out.println("나는 생성자");
	}
	
	public Ex11Studunt(int kor) {
		System.out.println(kor + " 을 받은 생성자");
	}
	
	public void showStudentDetail() {	// 학생정보출력
		System.out.println("학생 이름은 " + name);
		System.out.println("소유한 책은 " + book.getBookInfo());
	}
	

}
