package pack4Extands;

public class BicycleMain {

	public static void main(String[] args) {
		Bicycle bb = new Bicycle("Giant", 50, 50);
		Car cc = new Car("kia", 21, 21);
		
		cc.describe();
		bb.describe();

	}

}
