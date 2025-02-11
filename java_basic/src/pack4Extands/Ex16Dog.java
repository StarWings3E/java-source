package pack4Extands;

public class Ex16Dog {
	private String name = "개";
	
	public Ex16Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Ex16Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String callName() {
		return "종류 : " + name + "과";
	}
	
	public void print() {
		System.out.println(name + "과 동물들은 지구상에 산다.");
	}
	
	
}
