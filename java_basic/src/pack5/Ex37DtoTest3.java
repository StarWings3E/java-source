package pack5;

import java.util.ArrayList;
import java.util.StringTokenizer;

// 여러 개의 필드로 구성된 데이터가 문자열로 입력될 경우 필드별 문자로 분리후 레코드처리.
// 조건 : 문자열은 콤마(,) 등의 구분자로 구별되어 있다.
// 출력은 이름 총점 평균

public class Ex37DtoTest3 {
	private ArrayList<Ex37HakseangDto> list = new ArrayList<Ex37HakseangDto>();
	
//	public void stringSplitTest() {
//		String imsi = "kbs,mbc,sbs";
//		StringTokenizer tokenizer = new StringTokenizer(imsi, ",");
//		String s1 = tokenizer.nextToken();
//		String s2 = tokenizer.nextToken();
//		String s3 = tokenizer.nextToken();
//		System.out.println(s1 + " " + s2 + " " + s3);
//	}
	
	public void insertData(String [] datas) {
		//System.out.println(datas.length);		// 데이터 넘어왓는지 찍어보고 짜라 다 짜놓고 데이터 안넘어온거 찾기 힘들다
		for(int i=0; i< datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i], ",");
			String irum = tok.nextToken();
			int kor = Integer.parseInt(tok.nextToken());
			int eng = Integer.parseInt(tok.nextToken());
			int mat = Integer.parseInt(tok.nextToken());
			
			Ex37HakseangDto ex37HakseangDto = new Ex37HakseangDto(irum, kor, eng, mat);
			//ex37HakseangDto.setName(irum);	// setter로 값입력.
			
			list.add(ex37HakseangDto);
			
			
		}
		
	}
	
	public void showData() {
		//System.out.println(list.size());	// 데이터 넘어왓는지 찍어보고 짜라.
		System.out.println("이름\t총점\t평균");
		
		for (int i =0;i < list.size(); i++) {
//			Ex37HakseangDto dto = new Ex37HakseangDto();
//			dto = list.get(i);
			Ex37HakseangDto dto = list.get(i);	// 위에랑 같은 뜻이다.
			int tot = dto.getKor() + dto.getEng() + dto.getMat();
			double avg = tot / 3.0;		// 더블 적어줫으면 0.0 자릿수를 써줘야 실수모든것을 출력한다. 정수int로 입력시 나머지는 버리고 출력함.
			System.out.println(dto.getName() + "\t" + tot + "\t" + avg);
			
		}
		
		System.out.println("\n향상된 for 사용");
		for(Ex37HakseangDto dto:list) {
			int tot = dto.getKor() + dto.getEng() + dto.getMat();
			double avg = tot / 3.0;		// 더블 적어줫으면 0.0 자릿수를 써줘야 실수모든것을 출력한다. 정수int로 입력시 나머지는 버리고 출력함.
			System.out.println(dto.getName() + "\t" + tot + "\t" + avg);
		}
		
		
		
	}
	
	public static void main(String[] args) {
				
		String [] datas = new String[3];
		datas[0] = "김밥,100,100,100";
		datas[1] = "공기밥,90,78,77";
		datas[2] = "주먹법,70,70,88";
		
		Ex37DtoTest3 test3 = new Ex37DtoTest3();
		// 참고 : 문자열 분리 클래스 경험하기
//		test3.stringSplitTest();
		
		test3.insertData(datas);
		test3.showData();
		
		
		
	}

}
