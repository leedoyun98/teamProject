package com.example.demo.mem.domain;



import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class MemberDto {
	 private int memNo;
	private String memLevel;
	private String memName;
	private String memId;
	private String memPwd;
	private String brdImg;
}
