package pack5;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class Ex35DtoTest1 {
	private ArrayList<Ex35Student> list = new ArrayList<Ex35Student>();
	
	
	// dto 사용전 방식 (dto x)
	public void aa() {
		String [] persons = new String[3];
		persons[0] = "홍길동";
		persons[1] = "나길동";
		persons[2] = "고길동";
		
		for(String s:persons) {
			System.out.println(s);
		}
		
		
	}
	
	
	// 세명의 학생학번, 이름, 점수) 정보를 dto에 저장하기
	public void insertData() {
		Ex35Student student = null;
		
		//첫번째
		student = new Ex35Student();
		student.setHakbun("acron1");
		student.setIrum("홍길동");
		student.setJumsu(90);
		list.add(student);		// 임의의 컬렉션에 내용을 담고 공간을 닫는다. 그러면 다음 내용은 뜻은 같아도 다른내용이 들어갈수있다. (덮어쓰기 x, 새로쓰여짐)
		
		//두번째
		student = new Ex35Student();	// 위에서 객체를 생성해서 여기서 new안해도 될꺼같지만 new를 함으로서 객체 초기화 된다.
		student.setHakbun("acron2");
		student.setIrum("sk길동");
		student.setJumsu(88);
		list.add(student);
		
		//세번째
		student = new Ex35Student();
		student.setHakbun("acron3");
		student.setIrum("고길동");
		student.setJumsu(77);
		list.add(student);
		
		
	}
	
	public void showData() {
		System.out.println("list 크기: " + list.size());
		System.out.println("첫번째 학생 정보: " + list.get(0));
		System.out.println("du번째 학생 정보: " + list.get(1));
		System.out.println(list.get(2).getHakbun() + " " + list.get(2).getIrum() + " " + list.get(2).getJumsu());
		
		System.out.println("반복문을 사용해 컬렉션에 저장된 dto의 내용 출력");
		
		for(int i=0; i < list.size(); i++) {
			Ex35Student studentDto = new Ex35Student();
			studentDto = list.get(i);
			System.out.println(studentDto.getHakbun() + " " + studentDto.getIrum() + " " + studentDto.getJumsu());
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ex35DtoTest1 dtoTest1 = new Ex35DtoTest1();
		dtoTest1.aa();
		System.out.println();
		dtoTest1.insertData();
		System.out.println("학생 자료 저장후 딴짓을 하다가 새삼 문득 학생자료 찍기.");
		dtoTest1.showData();
		
		
		
		
	}

}
