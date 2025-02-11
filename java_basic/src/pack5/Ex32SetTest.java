package pack5;

import java.util.HashSet;
import java.util.Iterator;

// collection : 객ㅊ를 담을 수 있는 기억장소.
// 많은 수의 데이터를 그 사용 목적에 적합한 자료구조로 묶어 하나로 그룹화한 객체를 말합니다.
// 자바에서는 이러한 컬렉션을 위한 인터페이스와 클래스들이 있다.
// 컬렉션의 종류는 ArrayList, LinkedList, Vector, Stack, HashSet, TreeSet, HashMap
// List : 이름과 같이 목록처럼 데이터를 순서에 따라 관리합ㄴ디ㅏ. 중복 허용.
// Set : 중복이 허용되지 않는 데이터를 관리합니다.
// Map : 데이터를 Key와 Value로 짝을 이루어 관리하며, Key 값는 중복을 허용하지 않습ㄴ디ㅏ.
// Queue : 데이터 IN / Out 순서를 FIFO 방식으로 관리합니다. ( FIFO : first in first out ) 
// Stack : 데이터 IN / Out 순서를 LIFO 방식으로 관리합니다. ( LIFO : last in first out ) 

public class Ex32SetTest {		// 중복 불허, 순서없다.

	public static void main(String[] args) {
		// 컬렉션타입클래스<제네릭> : 제네릭은 컬렉션에 저장하 객체의 타입을 제한하는 역활.
		
		HashSet<Object> hlist = new HashSet<Object>();		// 자바의 모든내용을 '오브젝트' 이기때문에 <제네릭> 안에 정의한내용을 밑에 내용을 통과시킴.
		//HashSet<String> hlist = new HashSet<String>();
		
		hlist.add(1);		//1은 기본형 int인데 컬렉션에 넣으면 자동으로 Integer 클래스로 변화되어 저장됨.
		hlist.add(1.5);		//1.5는 기본형 double인데 컬렉션에 넣으면 자동으로 Double 클래스로 변화되어 저장됨.
		hlist.add("첫번째");
		hlist.add("두번째");
		hlist.add("세번째");
		hlist.add("첫번째");
		hlist.add("두번째");
		System.out.println("hlist 크기 : " + hlist.size());
		hlist.remove("두번째");
		System.out.println("hlist 크기 : " + hlist.size());
		
		// Iterator 반복자는 객체 ㅣ향적 프로그래밍에서 배열이나 그외 유사한 자료구조의 내부요소를 순회하는 객체다
		// 출력방법 1번
		Iterator iter = hlist.iterator();
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
			
		}
		
		// 출력방법 2번
		System.out.println();
		
		Object obj[] = hlist.toArray();		// 컬렉션을 배열로 전환.
		for(int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		// 출력방법 3번
//		System.out.println(); 
//		for(String aa:hlist) {
//			System.out.println(aa);
//		}
		
		

	}

}
