package day03;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요>>>");
		int 년도 = sc.nextInt();
		System.out.println("월을 입력하세요>>>");
	    int 번호 = sc.nextInt();
		
		if (번호 == 1 || 번호 == 3 || 번호 == 5 || 번호 == 7 || 번호 == 8 || 번호 == 10 || 번호 == 12) {
			System.out.println("31일");
		}else if (번호 == 4 || 번호 == 6 || 번호 == 9 || 번호 == 11) {
			System.out.println("30일");
		}else if (번호 == 2) {
			if (년도 % 4 == 0 && 년도 % 100 != 0 || 년도 % 400 == 0) {
				System.out.println("29일");
			}else {
				System.out.println("28일");
			}
		}
			
		
	}

}
