package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class Join2 {
	public static void main(String[] args) {
		Music1 m1 = new Music1();
		Music2 m2 = new Music2();
		
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();
	}
}

class Music1 extends Thread {
	@Override
	public void run() {
		ArrayList<String> arrList = new ArrayList<>();
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음 1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Music2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("배경음 2");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



//스레드1 : 배경 음악1 (10초)
//스레드2 : 배경 음악2 (5초)
//베경음악1이 끝나면 배경음악2가 시작할 수 있게 해줘야 함
