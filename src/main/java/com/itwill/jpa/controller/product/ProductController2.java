package com.itwill.jpa.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.jpa.repository.product.ProductRepository;
import com.itwill.jpa.service.product.ProductServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class ProductController2 {
	@Autowired
	private final ProductServiceImpl productServiceImpl;

	// 뮤직리스트 
	@GetMapping("/MusicList")
	public String musicList() {
		log.info("MusicList");
		return "MusicList";
	}

	// 뮤직디테일
	@GetMapping("/MusicDetail")
	public String MusicDetail() {
		log.info("MusicDetail");
		return "MusicDetail";
	}
	
	// 멤버십
	@GetMapping("/MembershipDetail")
	public String MembershipDetail() {
		log.info("MembershipDetail");
		return "MembershipDetail";
	}

	
	
}