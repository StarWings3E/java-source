package pack4Extands;

public class Ex20Manger extends Ex20Reguler{
	private double incentive;
	
	public Ex20Manger(String irum, int nai, int salary) {
		super(irum, nai, salary);
		
	
	}
	
	
	
	
	
	@Override
	public double pay() {
		if(super.pay() >= 2500000 )
			incentive = super.pay()*0.6;
		else if(super.pay() >= 2000000)
			incentive = super.pay()*0.5;
		else 
			incentive = super.pay()*0.4;
		
		return incentive;
	}
	
	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : " + pay());
		
	}
	
	
	
}


