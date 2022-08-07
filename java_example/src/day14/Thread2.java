package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		MyThread1 d1 = new MyThread1();
		d1.start();
		MyThread2 d2 = new MyThread2();
		d2.start();
		MyThread_3 d3 = new MyThread(d3);  //runnable로 상속받았을 경우
		d3.start();
	}
}

//스레드를 생성하여 동시에 2개의 작업을 수행하여라
//스레드1 : 스캐너를 사용해서 입력받으면 클릭
//스레드2 : 무한반복으로 0.52부터 Hello World 출력
class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println();
		Scanner d1 = new Scanner(System.in) {
			try {
				sleep(500);
			}
		}
	}
}

class MyThread2 extends Thread {  //추가스레드로 main함수(run으로 만들고 start로 실행)
	public void go() {
		// TODO Auto-generated catch block
		for (;;) {
			str = d2.next();
			System.out.println("Hello World");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// 0.5초 멈춤
			}
		}
	}
}

//자바는 다음상속이 안되기 때문에 추가로 상속할 수 없는 인터페이스를 제공 : ex) runable
class Thread_3 implements Runnable{
	
	@Override
	public void run() {
		//TODO Auto-generated method stub
		while(true) {
			System.out.println("BGM 실행중");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// 0.01초 스레드 중지
		}
	}
}
