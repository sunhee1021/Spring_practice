package org.zerock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/replies")
@RestController
@Log4j
@AllArgsConstructor 
//@AllArgsConstructor를 이용하여
//replyService 타입의 객체를 필요로 하는 생성자를 만들어서 사용
public class ReplyController {
	
	private ReplyService service;
}
//391페이지부터 다시 시작