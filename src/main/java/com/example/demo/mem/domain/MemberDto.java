package com.example.demo.mem.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class MemberDto {
	private String memid;
	private String password;
}
