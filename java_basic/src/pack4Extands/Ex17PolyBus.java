package pack4Extands;

public class Ex17PolyBus extends Ex17PolyCar{
	private int passenger = 10;
	
	
	public Ex17PolyBus() {
		System.out.println("car자식의 bus의 생성자");
		
	}
	
	@Override
	public void dispData() {
		System.out.println("버스 승객 수 : " + passenger);
		System.out.println("버스 속도는 " + speed);
	}
	
	public void show() {
		System.out.println("버스 고유 메소드");
	}
	
	
	
	
	
	
}
