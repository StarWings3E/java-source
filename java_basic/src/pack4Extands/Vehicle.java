package pack4Extands;

public class Vehicle {
	public String brand;
	private int speed;
	
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	
	
	public void describe() {
		System.out.println("This is a vehicle" + speed);
		
	}
	
	
	
}
