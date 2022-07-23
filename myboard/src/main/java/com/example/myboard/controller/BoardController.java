package com.example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//자바는 무조건 임포트 위주,이클립스는 그게 좀 어려움 = 컨트롤+스페이스로 대체

import com.example.myboard.service.UserService;


@Controller
public class BoardController {
	
	private UserService userService;
	
	//여기 유저서비스가 인터페이스 다형성 구조를 컨트롤러 해서 쓰는것
	public BoardController(UserService userService) {
		super();
		this.userService = userService;
	}


	@GetMapping("/")  //localhost:8084/  �� �̵��ϸ� ����Ǵ� �Լ�
	public String boardPage(Model model) {
		model.addAttribute("user", userService.getAllUser());
		return "index";  //index.html 로 이동
		
	}
}
