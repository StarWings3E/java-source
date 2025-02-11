package pack4Extands;

public class Ex21VolumeMain {

	public static void main(String[] args) {
		//Ex21Volum vol = new Ex21Volum();		// 추상클래스도 뉴 불가능이엿잖아 인터페이스도 동일하다!!
		Ex21Volum vol;
		
		Ex21Radis radio = new Ex21Radis();	// 얜 인터페이스 하위 클래스라서 뉴 가능함.
		Ex21Tv tv = new Ex21Tv();
		
		radio.volumeUp(6);
		radio.volumeDown(3);
		
		tv.volumeUp(7);
		tv.volumeDown(2);
			
		System.out.println();
		vol = radio;
		vol.volumeUp(2);
		vol = tv;
		vol.volumeUp(3);
		
		
		

	}

}
