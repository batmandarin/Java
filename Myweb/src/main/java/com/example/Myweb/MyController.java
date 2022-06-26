package com.example.Myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/")    //localhost:8084/ 입력하면 
	public String indexPage( ) {
		return "index";  //index.html 파일을 열어라
	}


	//오른쪽에 있는 값을 오ㅓ왼쪽으,ㅣ 이름으로 날리는 것 
	@GetMapping("/oper")  //localhost:8084/oper
	public String oper(Model model, @RequestParam("num1") String num) {
		String msg = "숫자를 입력하세요";
		int age = Integer.parseInt(num);
		if(age >= 20) {
			msg = "성인 입니다.";
		}else if(age >= 14) {
			msg = "미성년자 입니다.";
		}else {
			msg = "어린이 입니다.";
		}
		model.addAttribute("result",msg);  //result라는 키워드로 화면에 보내기 
		return "oper";   //oper.html 열어라
	}

}
	


