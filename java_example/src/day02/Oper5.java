package day02;

public class Oper5 {
	public static void main(String[] args) {
		//논리연산자 : 비교연산자를 여러개 사용할 수 있게함 
		/* and(둘 다 맞을 때만 true, 나머진 false) : &&
		   or(둘 중 하나라도 맞으면 true, 둘 다 틀리면 false) : ||
		   not(결과를 반대로 출력) : !
		 */
		boolean 참 = true;
		boolean 거짓 = false;
		int nuim = 10;
		
		//not
		System.out.println(참);
		System.out.println(!참);
		System.out.println(!거짓);
				
		//and
		System.out.println(참 && 참);
		System.out.println(참 && 거짓);
		System.out.println(거짓 && 참);
		System.out.println(거짓 && 거짓);
				
		//or
	    System.out.println(참 || 참);
		System.out.println(참 || 거짓);
		System.out.println(거짓 || 참);
		System.out.println(거짓 || 거짓);
		
		System.out.println(true || false);
		System.out.println(nuim > 5 && nuim < -5);
		System.out.println(!(nuim > 5));
		System.out.println((nuim > 5 && nuim < -5) || nuim >= 10);
		System.out.println(nuim > 5 && nuim < -5 || nuim >= 10);
		System.out.println(!(nuim > 5 && nuim < -5));
		
	}

}
