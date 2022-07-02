package day03;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String subject;
		int 국어, 영어, 수학, 총점;
		System.out.println("국어 점수를 입력하세요. :");
		국어 = sc.nextInt();
		System.out.println("수학 점수를 입력하세요. :");
		수학 = sc.nextInt();
		System.out.println("영어 점수를 입력하세요. :");
		영어 = sc.nextInt();
		System.out.println("총점을 입력하세요. :");
		총점 = sc.nextInt();
		
		총점 = 국어 + 영어 + 수학;
		
		if ((국어 >= 40 && 영어 >= 40 && 수학 >= 40 && 총점 >= 150)) {
		    System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	
	}
}


