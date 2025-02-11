package pack4Extands;

//public class Ex25Ball implements Flyer{	//	모든 메소드 오버라이딩해야함.
public class Ex25Ball extends Ex25FlyerAdapter{	// 작성자가 선택적으로 오버라이딩됨.
	// 인터페이스를 쓰면 인터페이스 안에 모든 내용을 사용해야 하지만, 
	// 인터페이스 상속받기전에 어댑터 클래스 하나 받아 작성하면 사용할 내용만 오버라이딩 가능.
	
	@Override
	public void fly() {
		System.out.println("야구공이 힘차게 관중석으로 날아감");
		
	}
	
	//원래 가져와야하는 인터페이스내용 2개를 안가져오고 1개만 가져와서 작성함. [ 인터페이스 > 상속(어댑터) > 자식클래스(상속) ]  
	
	

}
