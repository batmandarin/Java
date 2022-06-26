package day02;

public class Oper6 {
	public static void main(String[] args) {
		
		//누적 연산
		int num1 = 3;
		int num2 = 5;
		num1 = 4;
		num1 = num1;
		num1 = num2 + 2;
		num1 = 4;
		num1 += 5;//num1 = num1 + 5;
		num2 = num2;
		num2 = 5;
		num2 -= 2;
		num2 *= 3;
		num2 /= 4;
		
		System.out.println(num1);
		System.out.println("num2 = "+num2);
		//++ = +1, -- = -1
		//누적 연산을 하는데 1을 더하거나 뺄 경우 다 생략이 가능
		int num3 = 5;
		num3++; 
		System.out.println(num3);
		num3--;
		System.out.println(num3);
		num3 += 1;
		/*
		 int num = 9;
		 
		 num++; : 끝난 후에 +1
		 ++num; : 끝나기 전에 +1
		 num--; : 끝난 후에 -1
		 --num; :  끝나기 전에 -1
		 */
		//num3 == 5
		System.out.println("더하기 이전 : "+num3); //5
		System.out.println(++num3); //고랄호 안에서부터 실행 아직 출력이 안된 상태지만 플러스가 작요ㅕ이 되ㅏㅁ
		System.out.println("더하기 후 : "+num3); ///6
		//앞에  있으면 그 문장 실행 뒤에 +12
		//뒤에 있으먄 그 문장 끝난 후 다음 문장부터 +1
	}
}
