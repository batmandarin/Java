package day06;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Array4Ex xy = new Array4Ex();
		xy.go();
	}
}

class Array4Ex{
	Scanner xy = new Scanner(System.in);
	public void go() {
		String arr1[] = {"한국", "미국", "홍콩", "인도네시아", "일본", "러시아"};  
		String arr2[] = {"서울", "워싱턴DC", "홍콩", "보르네오", "도쿄", "모스크바"};
		int flag = 0;
		while(true) {
		System.out.println("어느 나라의 수도가 궁금하신가요?");
		String input = xy.next();  //input.equals()로 같은지 비교
		for (int i = 0; i < arr1.length; i++) {
			if(input.equals(arr1[i])) {
			System.out.println(arr1[i]+"의 수도는 "+arr2[i]+"입니다. ");
			flag = 0;
			break;
			}
			if(flag == 1) {
				
		
		}else {
			System.out.println("해당 국가는 존재하지 않습니다.");
		}
		}
	}
}
}
	
