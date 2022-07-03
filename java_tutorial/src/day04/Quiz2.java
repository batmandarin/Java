package day04;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String 수도 = "";
			while(true) {
				System.out.println("대한민국의 수도는??");
				수도 = sc.next();
                if(수도.equals("서울")) {
                	System.out.println("정답입니다.!");
                	break;
                }else {
                	if(수도.equals("0")) {
                		System.out.println("게임 종료합니다.");
                		break;
                	}
                	System.out.println("수도가 아닙니다.");
                }
            }
	}
}