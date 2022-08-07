package day14;

public class Thread1 {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		
		//프로그램 : 개발자가 만든 애플리케이션
		//프로세스 : 실행중인 프로그램
		//스레드 : 프로세스의 실질적인 실행(동작 수행)을 담당함
		//멀티스레드 : 하나의 프로세스에 여러개의 스레드를 동작시키는 것(원래는 main스레드만 다룸)
		//ex : 캐릭터를 움직이면서 배경음악이 재생이 되면서 채팅을 주고받는다.
		//스레드 상속extends로
		//main스레드 외 추가스레드를 생성하는 방법]
		//클래스를 만들어 스레드를 상속받고  run에 내용을 입력한 다음 start로 실행한다
		mc1.start();  //start : 추가 스레드 run에서도 실행
		mc2.start();  //start : 추가 스레드 run에서도 실행
		mc3.start();  //start : 추가 스레드 run에서도 실행
	}
}

class MyClass1 extends Thread{
	
	@Override
	public void run() {  //run: 추가스레드 실행- 추가스레드가 실행할 내용
		// TODO Auto-generated catch stub
		 for (int i = 0; i < 20; i++) {
			System.out.println("MyClass1"); //10번
			try {
				sleep(500);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5도 스레드 사용
		}
		
	}
} 

class MyClass2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("MyClass2"); //10번
			try {
				sleep(500);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5도 스레드 사용
		}
	}
	

}
class MyClass3 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("MyClass3"); //10번
			try {
				sleep(500);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //0.5도 스레드 사용
		}
	}
	
	
}