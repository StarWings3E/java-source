package pack2;

public class Ex3Singet {
	private String name = "무명 가수";
	private String titleSong = "마 대한민국";
	
	public Ex3Singet(String name, String title) {
		// 생성자
		this.name = name;
		titleSong = title;
	}
		
	public void sing() {
		//String name = "아이유";										// 지역 변수
		//System.out.println(name + "의 노래 제목은 " + titleSong);		// 지역변수를 머금은 문장
		System.out.println(this.name + "의 노래 제목은 " + titleSong);	// this. 를 써서 변수명은 같지만 클래스변수명을 따라갈때.
		
	}
	
	public void setTitleSong(String titleSong) {	//setter
		this.titleSong = titleSong; 
	}
	
	
	public static void main(String[] args) {
		Ex3Singet bts = new Ex3Singet("BTS", "다이너마이트");
		bts.sing();
		bts.setTitleSong("BTS 버터");	//setter을 적용
		bts.sing();						//입력한setter를 출력.
		bts.setTitleSong("느-에");
		bts.sing();
		
		System.out.println();
		Ex3Singet blackpink = new Ex3Singet("블랙핑크", "how you like that");
		blackpink.sing();
		
		
	}
	
	
	
	
}
