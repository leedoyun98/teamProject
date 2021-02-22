package com.example.demo.brd.domain;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class BoardDto {
	 private int brdNo;
	 private String  brdTitle;
	 private String brdContent;
	 private String brdwrittenDate;
	 private String brdRank;

}
