package day06;

public class Class4 {
	public static void main(String[] args) {
		//사칙연산 클래스를 사용\
	    사칙연산 A = new 사칙연산();
	    double result = 0;
	    result = A.더하기(3, 2);
	    System.out.println((int)result);
	    result = A.빼기(1,  2);
	    System.out.println((int)result);
	    result = A.곱하기(1,  2);
	    System.out.println((int)result);
	    result = A.나누기(2,  2);
	    System.out.println((int)result);
	}
}

class 사칙연산{
	//더하기, 빼기, 곱하기, 나누기
	int 더하기(int num1 , int num2) {
		return num1 + num2;
	}
	
	
	int 빼기(int num1, int num2) {
		return num1 - num2;
	}
	
	int 곱하기(int num1, int num2) {
		return num1 * num2;
	}
	
	int 나누기(int num1, int num2) {
		return num1 / num2;
	}
}
