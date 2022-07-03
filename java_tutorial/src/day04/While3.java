package day04;

public class While3 {
	public static void main(String[] args) {
		//3번
		int R = 5;
		while(R < 8) {
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");
		R++;
		}
        //여기로
		R = 1;
		while(R <= 3) {
			System.out.println(R+"번");
			R++;
		}
		
		int num = 3;
		//1부터 10까지 출력하기
	    while(num <= 12) {
	    	System.out.println(num+"count");
	    	num++;
	    }
	    
	    num = 10;
	    while(num >= 1) {
	    	System.out.println(num+"minus");
	    	num--;
	    }
		
	}
}
