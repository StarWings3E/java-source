package pack4Extands;

public class Ex24FlyerMain {
	public static void Main(String[] args) {
		// 인터페이스의 추상 메소드는 모두 오버라이딩 해야함....... << 전부..!
		System.out.println(Flyer.FAST);
		
		Ex24FlyerBird bird = new Ex24FlyerBird();
		bird.fly();	
		
		Ex24FlyerAirplane airplane = new Ex24FlyerAirplane();
		airplane.fly();
		
		
		
	} 
	
	
	
}
