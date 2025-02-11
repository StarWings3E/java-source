package pack4Extands;

public class Ex20Employeeaamain {

	public static void main(String[] args) {
		Ex20Temporary tem = new Ex20Temporary("홍길동", 23, 20, 150000);
		tem.print();
		
		Ex20Reguler reg = new Ex20Reguler("신기해", 25, 2345000);
		reg.print();
		
		Ex20Salesman sal = new Ex20Salesman("손오공", 27, 2890000, 30000, 0.25);
		sal.print();
		
		Ex20Manger man = new Ex20Manger("사오정", 33, 4578000);
		man.print();
		
		
	}

}
