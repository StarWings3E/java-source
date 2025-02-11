package pack2;

import java.rmi.server.ServerCloneException;

//매개변수 기본형뿐만 아니라 참조형도 가능.

class Person{	// 일반적으로 따로 파일을 작성해야 하지만 편의상 현재 클래스와 같은곳에 작성.
	String name;
	int age;
	
	public Person(String name, int age) { // String name : 참조형, int age : 기본형
		this.name = name;
		this.age = age;
		
	}
		

}

class PersonService{
	public PersonService() {
	}
	
	public void changeName(Person person, String newName) {
		System.out.println("person 변수 기억 주소 : " + person);
		person.name = newName;
	}
}


public class Ex7Para {

	public static void main(String[] args) {
		Person tom = new Person("한국인", 22);
		System.out.println("변경 전 이름: " + tom.name + " " + tom);
		System.out.println("tom 변수 기억 주소 : " + tom);
		Person james;		// 이름만 다른 껍데기를 생성
		james = tom;		// 껍데기에 tom을 뒤집어 씌운다
		System.out.println("james 변수 기억 주소 : " + james);	// 껍데기의 주소를 출력한다. << 알맹이는 같기때문에 같은 주소가 찍힌다.
		
		
		Person per = tom;
		System.out.println("per 변수 기억 주소 : " + per);
		
		PersonService service = new PersonService();
		service.changeName(tom, "신나는");		// person 변수가 가진 주소를 전달.
		System.out.println("변경 후 이름: " + tom.name + " " + tom);
		

	}

}
