package pack5;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.time.LocalDate;

public class Ex38DtoTest4 {
	private ArrayList<Ex38ExamDto> list = new ArrayList<Ex38ExamDto>();
	LocalDate now = LocalDate.now();
	
	public void insertData(String [] data) {
		//System.out.println(data.length);
		for (int i=0; i < data.length; i++) {
			StringTokenizer token = new StringTokenizer(data[i], ",");
			int saburn = Integer.parseInt(token.nextToken());
			String name = token.nextToken();
			int sudang = Integer.parseInt(token.nextToken());
			int year = Integer.parseInt(token.nextToken());
			
			Ex38ExamDto examDto = new Ex38ExamDto(saburn, name, sudang, year);
			//System.out.println(saburn + name + sudang + year);
			list.add(examDto);
		}
			
		
		
		
	}
	
	public void showData() {
		//System.out.println(list.size());
		System.out.println("사번\t이름\t기본급\t근무년수\t근속수당\t공제액\t수령액");
		
		for(Ex38ExamDto dto:list) {
			int y, sok;				// y = 근무년수 , sok = 근속수당
			double gong = 0, su, gub;		// gong = 공제액 , su = 수령액
			
			y = (now.getYear() - dto.getYear());
			
			if(0 <=y && y <= 3) {
				sok = 150000;
			}else if (8 >= y && y >= 4){
				sok = 450000;
			}else if (y > 9) {
				sok = 1000000;
			}else {
				sok = 0;
			}
			
			gub = (dto.getSudang()+sok);
			
			if(gub >= 3000000 ) {
				gong = gub * 0.5;
			}else if (gub >= 2000000 && 3000000 > gub){
				gong = gub * 0.3;
			}else if(2000000 > gub) {
				gong = gub * 0.15;
			}
			
			
			su = dto.getSudang()+sok-gong;
			
			
			
			
			System.out.println(dto.getSaburn()+"\t"+dto.getName()+"\t"+ dto.getSudang()+"\t"+ y +"\t"+ sok+"\t"+(int)gong+"\t"+su);
		}
		System.out.println("처리 건수: " + list.size());
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String [] data = new String[3];
		data[0] = "1,가나루,150000,2023";
		data[1] = "2,나다루,550000,2019";
		data[2] = "3,다라루,900000,2005";
		
		Ex38DtoTest4 test4 = new Ex38DtoTest4();
		
		test4.insertData(data);
		test4.showData();
		
	}

}
