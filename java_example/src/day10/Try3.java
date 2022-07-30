package day10;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		MyClass3 mc3 = new MyClass3();
		//mc3.go();
		double result = mc3.divide(20, 10);   //20 나누기 10
		System.out.println(result);
		
		result = mc3.divide(10, 0);  //10 나누기 0이니까 버그 발생
		System.out.println(result);
	}
}
class MyClass3{
	double divide(double num1, double num2) {
		double result = 0.0;//try는 소괄호 붙이는거 불가능
		try {  //0일때 나누기 하지마라  이프를 통해서 감쌈
			result = num1 / num2;    //0으로 나누면 프로그램 버그 발생이니 그 상황을 규정시켜서 예외처리
		//try와 이프 같음 하나로 통합해서 오류 해결한 트라이
	}catch(Exception e) {
		System.out.println("0일때는 실행할 수 없습니다.");
	}
		return result;
		
	}
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("프로그램 시작");
		int a = 0, b = 0, c = 0;
		
		System.out.println("숫자1을 입력하세요");
		try {
			a = sc.nextInt();   //버그발생 가능
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("20번째 줄에서 오류 발생");
		}
		//if(b != 0){} -> try{}
		System.out.println("숫자2를 입력하세요");
		try {
			b = Integer.parseInt(sc.next());  //버그발생 가능
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("28번째 줄에서 오류 발생");
		}
		try {
			c = a / b;  //버그발생 가능
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("35번째 줄에서 오류 발생");
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	
	}
	

