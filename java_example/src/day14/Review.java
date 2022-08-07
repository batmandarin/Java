package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Review {
	public static void main(String[] args) {
		List_ Ist = new List_();
		Ist.go();
		System.out.println("----------");
		Set_ set = new Set_();
		set.go();
		System.out.println("-----------");
		Map_ map = new Map
	}
}

class List_ {
	ArrayList<String> ar = new ArrayList();

	public void go() {
		// 어레이리스트는 기존 배열의 불편한 점을 개선한 클래스
		
		//추가 add
		ar.add("한개");  //0
		ar.add("두개");  //1
		ar.add("세개");  //2
		ar.add("네개");  //3
		
		System.out.println(ar.get(0));  //get 보기
		
		ar.get(), "추가 수정");
		System.out.println(ar.get(0));  //get 보기
		
		//ar.remove(1);
		ar.remove("두개 수정");
		
		System.out.println("==========");
		//전체 보기
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
}

class Set_ {
	Set<String> hs = new HashSet(); // 해쉬 셋 = 순서 없고 중복 안 되는 배열

	public void go() {
		hs.add("한개");
		hs.add("두개");
		hs.add("세개");
		hs.add("네개");

		// Set은 Iterator를 활용
		Iterator<String> iter = hs.iterator(); // 반복자
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

class Map_ {
	// 처음 값으로 이루어짐
	HashMap<Integer, String> hm = new HashMap<>();

	// 일반 배열 [1,2,3,4,5]
	// Map [키 값, 키 값, 키 값, 키 값]
	public void go() {
		// 추가 put
		hm.put(1, "첫번째"); // 0
		hm.put(2, "두번째"); // 1
		hm.put(3, "세번째"); // 2
		hm.put(4, "네번째"); // 3

		// 추가 get
		System.out.println(hm.get(5));

		// 전체 보기는 Set을 사용
		// 전체 키 보기 keySet()
		System.out.println(hm.keySet());

		Set<Integer> set = hm.keySet(); // 키를 전부다 가져오기
		Iterator<Integer> iter = set.Iterator(); // 반복자
		while ((iter).hashNext()) {
			int keyNum = iter.next();
			System.out.println(hm.get(keyNum));
		}
		// set을 사용해서 값 전체보기

	}
}
//("날씨":"흐림", "기온":"23", "지역":"서울") : JSON => Map
//List  : 순서0, 출력0 배열
//Set : 순서x, 출력x 배열
//Map : 키와 값으로 이루어진 배열

//ArrayList, HashMap
