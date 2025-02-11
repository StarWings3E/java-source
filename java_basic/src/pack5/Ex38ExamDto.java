package pack5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ex38ExamDto {
	// saburn = 사번, name = 이름 , sudang = 수당 , year = 근무시작년도
	
	private int saburn;
	private String name;
	private int sudang, year;
	
	
}
