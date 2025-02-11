package pack;

public class Test10array {

	public static void main(String[] args) {
		// 배열 : 성격크기타입이 일치하는 여러개의 기억장소(변수)를
		// 대표명 하나만 주고 첨자(색인)로, 각 기억장소를 구분, 반복처리에 효과적. ★★★ [ 매우 중요 ] ★★★
		// ex : 5과목 점수의 합 구하기
		int kor, eng, mat;								// 단순 변수 : 모든 기억장소를 각각 독립적으로 선언
		kor =90; eng =80; mat =100;
		int tot = kor + eng + mat;
		System.out.println("세 과목 점수의 합은 " + tot);
		
		System.out.println();
		// ex2 : 배열을 사용해 3과목 점수의 합 구하기
		int jumsu[] = new int[3];	// int[] jumsu = new int[3]; 동일하다. 같은뜻임
		jumsu[0] = 90; jumsu[1] = 80; jumsu[2] = 100;	// 
		int tot2 = 0;
		for(int i = 0; i < 3; i++) {
			tot2 = tot2 + jumsu[i];
					
		}
		System.out.println("세 과목 점수의 합은 " + tot2);
		
		System.out.println();
		// int ar; << 단순 변수 : 밑에 코드와 비슷해 보이는데 다름.
		//int ar[];		// 배열로 선언(아직 기억장소를 확보하지 못함), int[] ar;
		//ar= new int[5];	// 5개의 기억장소가 확보됨.
		
		int ar[] = new int[5];	// 대표명 ar인 int type의 변수 5개를 선언
		System.out.println("배열의 크기 : " + ar.length);
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = ar[0] + ar[1];
		System.out.println("ar[2] : "+ ar[2]);
		System.out.println(ar[3]);	// 기본값은 0을 기억.
		//System.out.println(ar[5]);						// 제대로 이해한건가 싶은데 이거 0부터 출발하기때문에 5값는 없는건가?  ar<5 인것같음
		// 배열의 인덱스(첨자)는 0부터 출발. << 자바만 그런거 아니고 모든언어가. 왼쪽기준으로 부터 출발
		
		int kbs = 2; 	// 변수를 실수정의 해준거를 배열안에 넣어도 되며, ★★★★★★★★★★★★★★★★ 배열안에 실수나 음수는 사용 불가능.
		System.out.println("ar[2] :" + ar[2] + " " + ar[kbs] + " " + ar[kbs + 1 - 1]);
		// ar[kbs] <== kbs 를 첨자 변수, 색인 변수, index variable라고 부른다.
		
		System.out.println();
		
		//배열 선언 후 초기값 저장.
		int[] ar2 = {1,2,3,4,5};	// 내부적으로 new를 내포하고 있음.
		System.out.println(ar2[0] + " " + ar2[4]);
		
		for(int i = 0; i < ar2.length; i++) {	// 배열 요소값 반복문으로 출력.
			System.out.print(ar2[i] + " ");
		}
		
		System.out.println();
		for(int k=0; k < ar2.length; k++) {	// 반복문으로 배열 요소에 값 저장.		
			ar2[k] = k + 10;				// 이거 어렵다 for문을 돌리며 반복문의 변수를 증가 시키거나 감소시킬수 있음.
		}									// 증가나 감소시킨 배열을 출력할때도 밑에 반복문코드로 뽑아낼수잇다.
		
		for(int k=0; k < ar2.length; k++) { // 표준 for문으로 배열을 반복함.
			System.out.print(ar2[k] + " ");
		}
		System.out.println();
		// 배열을 이용한 반복처리시 향상된 for문을 사용 가능합니다.
		for(int no:ar2) {	// ar2 배열 요소가 차례대로 no에 치환되면서 반복처리
			System.out.print(no + " ");
		}
		
		System.out.println();				// double 활용가능
		double silsu[] = {3.5, 2.1, 6.8};
		for(int i=0; i < silsu.length; i++) {
			System.out.print(silsu[i] + " ");
		}
		
		System.out.println();				// 변수 변경가능.
		String[] city = {"서울","제주","원주"};
		for(int abc =0; abc < city.length; abc++) {
			System.out.print(city[abc] + " ");
		}
		System.out.println();				// 변수변경해도 향상된 for문 사용가능.
		for(String ㅊ:city) {	// 여기 사용하는 변수도 내가 설정가능함.
			System.out.print(ㅊ + " ");
		}
		System.out.println();
		System.out.println("5명의 사람 키(정수)를 배열에 저장하고 평균 키 출력");
		int[] height = {178, 166, 177, 175, 180 };
		int hap = 0;
		for(int i=0; i < height.length; i++) {
			hap += height[i];
		}
		double heghtAvg = (double)hap / height.length;	// 175.2
		//double heghtAvg = hap / height.length;		// 175
		System.out.println(height.length + "명의 평균 키는 " + heghtAvg);
		// height 기억장소는 1차원 배열 : 한 행에 요소(열)로만 구성된 배열
		// 행+열 사용하면 2차원 배열이 됩니다.
		
		System.out.println();
		System.out.println("2차원(다차원) 배열 --------------");
		//int su;	// 한개의 독립변수
		//int su[];	// 열로만 구성된 집합 변수 : 1차원 배열
		//int su[][]; // 행과 열로 구성된 집합 변수 : 2차원 배열
		//su = new int [3][4];
		int su[][]= new int[3][4];	
		// 1차원 배열  ->> int su = new int[12]; 위의 코드와 동일한 뜻이지만 1차원2차원 다르다.
		System.out.println("행의 개수" + su.length);
		System.out.println("열의 개수" + su[0].length);
		su[0][0] = 7;
		System.out.println("su[0][0] : " + su[0][0]);
		System.out.println();
		
		// 2차원 배열 su에 값저장
		int num = 10;
		for(int i=0; i < su.length; i++) {
			for(int j=0; j < su[i].length; j++) {
				su[i][j] = num++;	// num값을 주고나서 ++하는 코드 // su[i][j] = ++num; << 이건 ++을 하고 num값을 주는 코드.
			}
		}
		
		for(int i=0; i < su.length; i++) {
			for(int j=0; j < su[i].length; j++) {	
				System.out.print(su[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("문1 : 1차원 배열 요소에서 홀수와 짝수의 합 각각 출력 ");	//	★★★★★★★★★★★★
		int arr[] = {1, 2, 3, 4, 5, 6};
		int oddSum = 0;
		int evenSum = 0;
		for(int p=0; p < arr.length; p++) {
			if(arr[p] % 2 == 0 ) {	// 짝수
				evenSum += arr[p];
			}else {					// 홀수
				oddSum += arr[p];
			}
		}
		System.out.println("짝수의 합 : " + evenSum + " 홀수의 합 : " + oddSum);
		
		
		System.out.println();
		System.out.println("문2 : 2차원 배열 요소의 합 출력 ");
		int arr2[][] = {{1,2}, {3,4}};
		int sum = 0;
		for(int p=0; p < arr2.length; p=p+1) {
			for(int j=0; j < arr2[p].length; j++) {
				sum += arr2[p][j];
			}
		}
		System.out.println("arr2 배열 요소의 총합 " + sum);
				
		
		
		
	}

}
