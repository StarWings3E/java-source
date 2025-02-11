package pack2;

public class Ex4Main {

	public static void main(String[] args) {
		System.out.println("[메소드] 오버로딩 연습");
		Ex4Animal tiger = new Ex4Animal();
		tiger.display();
		tiger.display(3);
		tiger.display("호랑이");
		tiger.display(5, "라이거");
		tiger.display("호돌스", 2);
		
		System.out.println("\n[생성자] 오버로딩 연습");
		Ex4Animal dog = new Ex4Animal();
		dog.display();
		
		Ex4Animal hen = new Ex4Animal(1);
		hen.display();
		
		Ex4Animal wolfdog = new Ex4Animal("늑대", 7);
		wolfdog.display();
		
	}

}
