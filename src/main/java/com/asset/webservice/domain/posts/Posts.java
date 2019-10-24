package com.asset.webservice.domain.posts;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length=500,nullable=false)
	private String title;
	
	@Column(columnDefinition="TEXT",nullable=false)
	private String content;
	
	private String author;
	
	@Builder
	public Posts(String title, String content, String author) {
		
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	
	
}
