package day04;

public class Loop1 {
	public static void main(String[] args) {
		// 0~9
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	    System.out.println("============");
		//continue : 짝수만 출력되게 해보셈
		for (int i = 1; i < 10; i++) {
		    if(i % 2 == 1) {
				continue; //이 코드가 실행되면 반복문의 처음으로 돌아감(1회성 취소)
			}
		    System.out.println(i);
		    }
		} 
		//break : 반복문 즉시 종료
		//continue : 반복문 1회성 종료 (원래는 중괄호 마치고 조건을 검사하지만, 바로 조건 검사로 넘어감)
	}

