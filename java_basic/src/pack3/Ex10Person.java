package pack3;

public class Ex10Person {
	public String name;
    public int age;
    public Ex10Address adress;
    

    
    
    public Ex10Person(String name, int age) {
		this.name = name;
		this.age = age;
    	adress = new Ex10Address("역삼동123");
	}
    
    
    public void display() {
    	
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + adress.getStreet());
        
    }
    
    
    

}
