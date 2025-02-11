package pack4Extands;

public class Ex16WolfDog extends Ex16Dog{
	private String where = "동물원";
	
	public Ex16WolfDog(String name) {
		super(name);
	}
	
	
	public void show() {
		System.out.println("어디 사니? " + where);
	}
	
	@Override
	public void print() {
		System.out.println(getName() + " : " + where + " 사람들 시선을 느끼며 산다.");
	}
	
	
	
	
	
	
	
}

