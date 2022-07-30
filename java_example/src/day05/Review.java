package day05;

public class Review {
	public static void main(String[] args) {
		//출력 syso
		System.out.println("출력");
		//컨트롤+f11=실행
		//변수
		String str1 = "Hello world";
		int num1 = 0;
		double dNum1 = 0.0;
		System.out.println(str1+", "+num1+", "+dNum1);
		//조건문 if, switch
		if(num1 >= 0) {
			System.out.println("0이상or(||)양수");
		}else if(num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		switch(num1) {
		case -1:
			System.out.println("-1");
			break;
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		default:
			System.out.println("그밖에");
		}
		
		switch(num1 % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
		
		// 반복문 while, for (+break, continue)
		int flag = 0;
		while(flag < 1) {
			System.out.println("while문");
		    flag++;
		}
		
		for(int i=0;i<1;i++) {
			System.out.println("for문");
		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				//break        //반복문 종료//브레이크가 오히려 철저하게 이거까지 하고 넘기라ㅣㄴㄸ스이고콘티뉴는그냥 넘기고
				//바로 다음걸로 갈아타고 검사하고 넘길한 뜻이라 오육이 아니라 i+1로 육 넘기고 칠부터 다시 검사하고 진행
				continue;      //1회성 취소
			}
			System.out.println(i+1+"번");
		}
		
	}
}
