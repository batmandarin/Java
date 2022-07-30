package Day10;

import java.util.Scanner;

public class Try1 {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		mc1.go();
	}
}
//유튜브 갑자기 꺼짐, 다운로딩 멈춤 등의 오류들의 동작 실행 오류, 프로그램 다운들이 왠만하면 이것과 같은 문제들임. 종료문 내몰거나 예외처리 하기도 전에ㅐ꺼지는 것
class MyClass1{
	int num1 = 10;
	int num2 = 0;
	public void go() {
		System.out.println("go실행");
		scan();
		//예외처리 
		if(num2 != 0) {  //그래서 예외처리로 0이 아나리 체크
			System.out.println(num1 / num2);  //0으로 나눔
		}
		
		System.out.println("go종료");
	}
	
	public void scan() {
		Scanner spc = new Scanner(System.in);
		System.out.println("num2에 넣을 숫자를 입력하세요>>");
		int num = spc.nextInt();  //숫자가 아닌 문자열을 넣으면 프로그램이 강제 종료 되어버림
		num2 = num;
		spc.close();
	}
}
