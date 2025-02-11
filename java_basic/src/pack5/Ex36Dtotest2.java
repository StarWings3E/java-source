package pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex36Dtotest2 {
	private ArrayList<Ex36StudDto> list = new ArrayList<Ex36StudDto>();
	private String name;
	private int a, b;
	
	
	public void insertData() {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름: ");
			name = sc.next();
			System.out.print("국어점수: ");
			a = sc.nextInt();		
			System.out.print("영어점수: ");
			b = sc.nextInt();
			
			Ex36StudDto studDto = new Ex36StudDto();
			studDto.setName(name);
			studDto.setA(a);
			studDto.setB(b);
			list.add(studDto);
						
			
			System.out.println("계속 할까요?(Y/N)");
			String n = sc.next();
			if(!n.equals("y")) {					//  ★★★★★★★★★★★★
				break;
			}
			
			sc.close();
		}
		
	}
	
	public void showData() {
		int count = 0;		// 인원수 카운트	지역변수로 써라
		
		for(int i=0; i < list.size(); i++ ) {
			Ex36StudDto studDto = list.get(i);
			int tot = studDto.getA() + studDto.getB();
			
			System.out.println(studDto.getName() + " " + studDto.getA() + " " + studDto.getB() + " " + tot);
			count += 1;
			
		}
		System.out.println("응시 인원: " + count);		// 이것도 되고
		System.out.println("응시 인원: " + list.size());	// 이것도 된다.
		
		
	}
	
	

	public static void main(String[] args) {
		Ex36Dtotest2 test2 = new Ex36Dtotest2();
		test2.insertData();
		test2.showData();
		
		
	}

}
