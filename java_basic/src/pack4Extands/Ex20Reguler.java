package pack4Extands;

public class Ex20Reguler extends Ex20Employee{
	private int salary;
	
	
	public Ex20Reguler(String irum, int nai, int salary) {
		super(irum, nai);
		this.salary = salary;
		
	}
	
	
	
	
	@Override
	public double pay() {
		return salary;
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 급여 : " + pay());
		
	}
	
	
	
	
	
}
