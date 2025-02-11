package pack4Extands;

public class Ex17PolyMain {
	public static void main(String[] args) {
		Ex17PolyCar car1 = new Ex17PolyCar();
		Ex17PolyBus bus1 = new Ex17PolyBus();
		Ex17PolyTaxi taxi1 = new Ex17PolyTaxi();
		System.out.println();
		
		car1.dispData();
		System.out.println(car1.getSpeed());
		
		System.out.println("버스에 대해....");
		bus1.dispData();
		System.out.println(bus1.getSpeed());
		bus1.show();
		
		System.out.println("택시에 대해....");
		taxi1.dispData();
		System.out.println(taxi1.getSpeed());
		
		System.out.println("===============주소 치환=================");
		Ex17PolyCar car2 = new Ex17PolyBus();
		car2.dispData();
		
		System.out.println();
		Ex17PolyCar car3 = taxi1;
		car3.dispData();
		
		System.out.println("---------------다형성-------------------");
		// Ex17PolyBus bus2 = new Ex17PolyCar();
		Ex17PolyBus bus2 = (Ex17PolyBus)car2;
		bus2.dispData();
		bus2.show();
		
		System.out.println();
		Ex17PolyTaxi taxi2 = (Ex17PolyTaxi)car3;
		taxi2.dispData();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Ex17PolyCar p[] = new Ex17PolyCar[3];
		
		p[0] = car1;
		p[1] = bus1;
		p[2] = taxi1;
		p[0].dispData();
		p[1].dispData();
		p[2].dispData();		
		
		System.out.println();
		for(int i= 0; i < p.length; i++) {
			p[i].dispData();
		}
		
		System.out.println();
		
		for(Ex17PolyCar car:p) {
			car.dispData();
		}
		
		
		
		
		
		
	}
	
	
}
