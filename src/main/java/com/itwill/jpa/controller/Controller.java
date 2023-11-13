package com.itwill.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.jpa.entity.board.Board;
import com.itwill.jpa.service.board.BoardServiceImpl;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	
	@Autowired
	BoardServiceImpl boardServiceImpl;
		
	@GetMapping("/index") 
	public String index(Model model) { 
		List<Board> magazines = boardServiceImpl.findBycategory(3L);
		model.addAttribute("magazines", magazines); 
		return "index"; 
	}
	@GetMapping("/Audio")
	public String userprofile() {
		String forwardPath = "Audio";
		return forwardPath;
	}
	@GetMapping("/test") 
	public String test() { 
		String forward_path = "test"; 
		return forward_path; 
	}
	@GetMapping("/common") 
	public String common() { 
		String forward_path = "common"; 
		return forward_path; 
	}
	
	@GetMapping("/admin") 
	public String admin() { 
		String forward_path = "admin_form"; 
		return forward_path; 
	}
	
	
	@GetMapping("/admin_Board") 
	public String admin_Board() { 
		String forward_path = "admin_board_form"; 
		return forward_path; 
	}
	
	@GetMapping("/admin_music") 
	public String admin_Product_music() { 
		String forward_path = "admin_product_music_form"; 
		return forward_path; 
	}
	
	@GetMapping("/admin_goods") 
	public String admin_Product_goods() { 
		String forward_path = "admin_product_goods_form"; 
		return forward_path; 
	}
	
	@GetMapping("/admin_ticket") 
	public String admin_Product_ticket() { 
		String forward_path = "admin_product_ticket_form"; 
		return forward_path; 
	}
	
		
	
}