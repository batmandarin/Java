package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요 :");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 se1 = new StringEx1();
		se1.go(price);
	}

}

class StringEx1{
	//천원 단위로 ,를 붙여주세요
	//500 -> 500
	//5000 -> 5,000
	//20000 -> 20,000
	//1000000 -> 1,000,000
	//1000000000 -> 1,000,000,000
	public String go(int num) {
		//num을 문자열로 (정수 -> 문자열)
		String numString = ""+num; 
		if(num < 1000) {   //범위를 비교 , 문자열 길이 비교 ex) substring, String, str+"" 바로 뒤에 idx+상수(띄어쓰기까지 포함한 null칸 만큼 잘라내기됨
			System.out.println(num);
		}else if(num < 10000) {//9999
			String str1 = numString.substring(0, 0+1);
			String str2 = numString.substring(1, 3+1);
			System.out.println(str1 + "," + str2);
		}else if(numString.length() == 5) {
			String str1 = numString.substring(0, 1+1);
			String str2 = numString.substring(2, 4+1);
			System.out.println(str1 + "," + str2);
		}else if(num < 1000000) {//100000 - 999999
			String str1 = numString.substring(0, 2+1);
			String str2 = numString.substring(3, 5+1);
			System.out.println(str1 + "," + str2);
		}else if(num < 10000000) {//9999
			String str1 = numString.substring(0, 1);
			String str2 = numString.substring(1, 3+1);
			System.out.println(str1 + "," + str2);
	
		
	
}
