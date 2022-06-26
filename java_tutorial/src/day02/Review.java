package day02;

public class Review {
	public static void main(String[] args) {
		System.out.println("입력하고 싶은 말");
		
		//변수 (저장공간)
		String 변수1;   //자료형 변수형
		변수1 = "저장할 말";  //대입 (오른쪽 값 -> 왼쪽 공간
		변수1 = 변수1;
		String 변수2 = "저장 말"; //초기화 (선언 + 대입)
		
		//변수 사용
		System.out.println(변수1);
		System.out.println("나의 말은 : "+변수2);
		//변수의 자료형 
		int 정수형 = -33333;
		double 실수형 = 3.141592;
		String 문자열형 = "저장";
		boolean 참거짓형 = true;
		//자료형1 : 의도를 명확화
		//자료형2 : 개발자의 실수를 방지
		//변수1 = 3.141592
		
		//연산자(기능)
		int result;
		result = 32+3;
		result = 33-1;
		result = 3*3;
		result = 19/2;
		result= 232%5;   //나머지구하기
		
		System.out.println(result);
	}

}
