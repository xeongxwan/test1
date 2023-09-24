package exam;

import java.util.Scanner;

public class StudentMain {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student std = new Student();  // 객체 생성
		
		while(true) {
			int selectNum = 0; // 선택 번호를 담을 변수
			
			//안내 문구 - 공통적으로 사용하는 메시지
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택 > ");
			selectNum = scan.nextInt();
			
			if(selectNum == 5 ) {
				System.out.println("프로그램 종료");
				break; // while 반복문을 종료
			}
		
			switch (selectNum) {
				case 1: // 학생수를 입력 받기 - 배열 공간을 확보(점수 배열을 완성)
					std.studentCount(); //메소드 호출
					break;
					
				case 2 : //점수를 입력하기 - 배열 공간에 입력된 점수를 넣기
					std.inputScore();
					break;
					
				case 3 : // 점수 리스트 보기 - 배열의 내용만 읽어서 보여주기
					std.scoreList();
					break;
					
				case 4 : //분석
					std.analysis();
					break;
			default:
				System.out.println("번호 선택 오류, 다시 입력하세요....");
				break;
			}// end of switch	
			
		}//end of while
	}

}
