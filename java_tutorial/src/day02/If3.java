package day02;

public class If3 {
	public static void main(String[] args) {
		int 비밀번호 = 1234;
		int 입력번호 = 1234;
		
		if(비밀번호 == 입력번호) {
			System.out.println("어서오십시오");
		}else {
			System.out.println("누구시죠???");
		}
		int 나이 = 17;
		
		if(나이 >= 20) {
			System.out.println("성인");
		}else
			System.out.println("미성년자");
		
		//퀴즈 : if - else구문을 사용해서 20살 이상은 "성인", 20살 미만은 "미성년자"
	}

}
