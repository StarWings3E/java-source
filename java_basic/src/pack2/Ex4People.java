package pack2;


// 문제 : 사람의 나이를 출력하는 메서드를 작성하시오
// 		사람의 이름과 나이를 출력하는 printAge 메서드를 작성하시오.
// 조건1 : 아름과 나이를 매개변수로 전달하면 "이름은 [이름], 나이는 [나이]살입니다. " 출력
// 조건2 : 이름만 전달하면 "이름은 {이름], 나이는 알 수 없습니다." 출력
// 조건3 : 매개변수가 없으면 "이름과 나이가 없습니다." 출력
public class Ex4People {	// 문제풀이 : 메소드 오버로드하여 답을 작성하면 됨.
	//private String name;
	//private int age;			<< 여기 전역변수 설정 안해도되는게 값을 받을꺼면 this.나 변수설정이 없어도 출력됨.
	
	/*public Ex4People() {  // 비어있는 생성자는 없어도 실행이 되는구나
		
	}*/
	
	
	public void printAge() {
		System.out.println("이름과 나이가 없습니다.");
	}
	
	public void printAge(String name) {
		//this.name = name;			<< 모든 값은 받아서 쓰기 때문에 필요없다.
		System.out.println("이름은 " + name + ", 나이는 알 수 없습니다.");
	}
	
	public void printAge(String name, int age) {
		//this.name = name;			<< 모든 값은 받아서 쓰기 때문에 필요없다.
		//this.age = age;			<< 모든 값은 받아서 쓰기 때문에 필요없다.
		System.out.println("이름은 " + name + ", 나이는 " + age + "살 입니다.");
	}
	
	public static void main(String[] args) {
		Ex4People gg = new Ex4People();
		gg.printAge();
		gg.printAge("홍길동");
		gg.printAge("에이콘", 5);

	}

}
