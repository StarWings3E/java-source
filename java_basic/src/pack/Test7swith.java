package pack;

public class Test7swith {
	
	public static void main(String[] args) {
		// switch : 조건 판단문의 좀 더 정형화된 문법으로 값에 따라 여러 방향으로 분기하는 경우 효과적
		// 길게 늘어진 if문에 비해 코드가 짧고 의미파악이 쉽다.
		int nai = 33;
		nai = nai / 10 * 10;  // 여기 정수 나누기 사용한 이유 : 몫만 뽑아내서 뒷숫자 덜어내고 스위치문에 대입하려고.
		
		switch (nai) {
		case 20:
			System.out.println("20대");
			break;						// 스위치문 중간중간 분리해주는것 break
		case 30:
			System.out.println("30대");
			System.out.println("인생의 황?금기");
			break;
		default:			////  		default 없으면 스위치문에 해당이 되지 않을때 사용하지 않음.
			System.out.println("기타");
			break;
		}
		
		
		System.out.println("\n계속1");
		
		switch (nai) {
		case 10:
		case 20:
			System.out.println("젊음");
			break;						// 스위치문 중간중간 분리해주는것 break
		case 30:						// break 없으면 알아서 흘러 내려가서 브레이크 만날때까지 실행함.
		case 40:
		case 50:
			System.out.println("왕성한 활동");
			break;						// 결국 만난 브레이크로 인해 여기서 스위치문을 나감.
		default:
			System.out.println("그 외 기타");
			break;
		}
		
		System.out.println("\n계속2");
		//System.out.println((int)(Math.random()*10)); // 난수 발생  ㄹㅇ 랜덤 숫자 나옴
		int sigan = (int)(Math.random() * 4) + 8;
		switch (sigan) {
		case 8:
			System.out.println("출근 준비");
			break;
		case 9:
			System.out.println("출근 완료");
			break;
		case 11:
			System.out.println("팀 회의");
			break;
		default:
			System.out.println("개인 활동");
		}
		System.out.println(sigan);
				
		
		System.out.println("\n계속3");
		String jik = "과장";
		
		switch(jik) {							//// 스위치문 안에 문자가 들어와도됩니다~~~~~(대신 문자라면 범위지정은 힘듬)
		case "사원":
			System.out.println("사원 업무");
			break;
		case "과장":
			System.out.println("과장 업무");
			break;
		default:
			System.out.println("기타 직급");
			break;
		}
	}
		
}
