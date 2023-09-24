package exam;

public class Student {
	
	int[] score; //인스턴스 필드
	
	//학생수 입력 받아 처리, 인스턴스 메소드 - 객체가 생성되어야 실행할 수 있음
    void studentCount() { 
		int studentNum = 0;
    	System.out.println("학생수 >> ");
    	studentNum = StudentMain.scan.nextInt();
    	
    	
    	score = new int[studentNum];
    	return;  
    	
	}//end of studentCount
	

	//점수를 입력받아 처리-인스턴스 메소드
    void inputScore() { //default 접근 제한자
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] : ");
			score[i] = StudentMain.scan.nextInt();
		} //end of for
		return; 
	}//end of inputScore
	
	//점수 리스트를 출력 - 인스턴스 메소드
	void scoreList() { //default 접근제한자
		for(int i=0; i<score.length; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}//end of for
		
		return; 
	}//end of scoreList
	

	//분석 처리 - 인스턴스 메소드
	void analysis() {  //default 접근제한자
		int sum =0, max = score[0], min = score[0];
		float avg = 0.0f;
		
		//합계, 최댓값, 최솟값
		for(int i=0; i<score.length; i++) {
			//합계
			sum += score[i];
			
			//최댓값
			if(max < score[i]) { max = score[i]; }
			
			//최솟값
			if(min > score[i]) { min = score[i]; }
		} //end of for
	  
		//출력
		System.out.println("합  계 : " + sum);
		System.out.printf("평  균 : %.2f\n",avg);  //소수이하 둘째자리까지 표현하기 위해
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}//end of analysis
	
	
	
	
}
