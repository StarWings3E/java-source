package pack4Extands;

public class Ex17PolyTaxi extends Ex17PolyCar{
	private int passenger = 2;
	
	public Ex17PolyTaxi() {
		System.out.println("난 Car의 자식은 Taxi 생성자 ");
	}
	
	@Override
	public void dispData() {
		String msg = "택시안에 몇명이 타고 있니? " + passenger;
		System.out.println(msg);
		
	}
	
	
	
}
