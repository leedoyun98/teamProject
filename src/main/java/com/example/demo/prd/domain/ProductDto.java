package com.example.demo.prd.domain;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class ProductDto {
	 private int prdNo;
	 private String prdName;
	 private String prdPrice;
	 private String prdInv;

}
