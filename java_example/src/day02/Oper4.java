package day02;

import day01.Syso1;

public class Oper4 {
	public static void main(String[] args) {
		//비교 연산자
		/*
		 == : 같다
		 != : 다르다
		 < : 왼쪽이 작다
		 > : 오른쪽이 작다
		 <= : 왼쪽이 작거나 같다
		 >= : 오른쪽이 작거나 같다
		 
		 비교 연산자는 왼쪽과 오른쪽을 비교하고 결과를 true 혹은 false 로 알려줍니다 (boolean type)
		 */
		int num = 10;
		System.out.println(num == 10);
		System.out.println(num != 10);
		System.out.println(num < 9);
		System.out.println(num > 11);
		System.out.println(num >= 3.14);
		System.out.println(num <= 3.14);
	}

}
