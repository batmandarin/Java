package day04;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int i = 1;
			while(i <= 5) {
				System.out.println("비밀번호 입력");
				int pw = sc.nextInt();
                if(pw == 1000) {
                	System.out.println("비밀번호 성공적");
                	break;
                }else {
			System.out.println("비밀번호가 틀렸습니다.");
			if (i == 5) {
				System.out.println("횟수 초과입니다.");
			}
			}
                i++;
			}
	}
}
	




