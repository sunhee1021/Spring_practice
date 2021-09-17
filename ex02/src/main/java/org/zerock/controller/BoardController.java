package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) {
		
		log.info("list");
		model.addAttribute("list", service.getList());
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		log.info("register : "  + board);
		
		service.register(board);
		
		rttr.addFlashAttribute("result", board.getBno());
		
		return "redirect:/board/list";
	}
}
