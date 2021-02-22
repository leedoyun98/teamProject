package com.example.demo.brd.domain;


import javax.persistence.Column;

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
	 private String brdImg;
	 private int brdKind;
	 private String brdModData;
	 private int count;
	 private String brdLike;

}
