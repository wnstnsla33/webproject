package com.sist.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/home")
	public String login() {
		System.out.println("됨");
		Member member = new Member();
		memberRepository.save(member);
		return "login";
	}

}
