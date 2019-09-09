package com.asset.webservice.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asset.webservice.posts.PostsRepository;
import com.asset.webservice.posts.PostsSaveDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

	
	private PostsRepository repository;
	
	@RequestMapping("/")
	public String home() {
		
		return "test";
	}
	
	@RequestMapping("/post")
	public PostsSaveDto post(@RequestBody PostsSaveDto dto) {
		repository.save(dto.toEntity());
		
		return dto;
	}
}
