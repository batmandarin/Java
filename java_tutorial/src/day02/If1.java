package day02;

public class If1 {
	public static void main(String[] args) {
		//if :  조건문
		//현 상황에 대하여 내 프로그램의 동작을 결정하고 싶을때
		//예시 : 버스 -성인/청소년/어린이 -> if사용
		
		/*
		if(조건) {
			//조건이 맞을때 실행할 코드 여기다가 작성
		}
		
		//만약 조건이 맞지 않으면 if 옆의 ()코드가 실행 안됨 
		*/
		
		int 나이 = 30;
		if(나이 >= 20) {
			System.out.println("성인입니다.");
		}
		
		if(나이 < 20) {
			System.out.println("미성년자 입니다.");
		}
		
		//아래 조건은 무시하고 여기로 진행시킴
	}

}
