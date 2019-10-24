package com.asset.webservice.web;

import com.asset.webservice.domain.posts.PostsSaveDto;
import com.asset.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

	
	private PostsService postsService;
	

	
	@PostMapping("/post")
	public Long post(@RequestBody PostsSaveDto dto) {

		return postsService.save(dto);
	}
}
