package day06;

public class Array2 {
	public static void main(String[] args) {
		Array2Ex array2Ex = new Array2Ex();
		array2Ex.go();
		//go()를 사용해서 실행
	}
}

class Array2Ex{
	public void go() {
		String 메뉴[] = {"초콜릿" , "민트" , "모카", "쿠키"};
		int num1 = 1000, num2 = 1500, num3 = 2000, num4 = 2500;
		System.out.println(num4);
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
		//카페메뉴와 가격
		int num[] = {1000, 1500, 2000, 2500}; //총 0 , 1, 2, 3 포지션(칸에 배치된 숫자들)
		System.out.println(num[1]); //그래서 1넣은 num으로 1500이 나옴
		
		for (int i = 0; i < 메뉴.length; i++) { //전체반복수량설정(int num 칸 개수가 3개면 총 3번 반복)
			System.out.println(메뉴[i]);
		}
	}
}
