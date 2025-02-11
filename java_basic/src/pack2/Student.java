package pack2;

public class Student {
	private String name;
	private int grade;
	private double scroe;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public double getScroe() {	//메소드 이름은 약속. get멤버변수(멤버변수 첫글자는 대문자) <-------getter메소드 ★★★
		return scroe; // age변수 자체를 반환하는 것이 아니라 age에 기억된 정수를 반환
	}
	
	public void setScroe(double scroe) {	//메소드 이름은 약속. set멤버변수(멤버변수 첫글자는 대문자) <-----setter메소드 ★★★
		this.scroe = scroe;
	}
	
	
	public void printStudentInfo() {
		System.out.println("이름: " + name + " 학년 : " + grade + " 평균 점수 : " + scroe);
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		Student main = new Student("홍길동", 5);
		main.setScroe(99.9);
		
		main.printStudentInfo();
	}

}
