package com.example.demo.prd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity @Table(name="products")
public class Product {
	@Id @Column(name="prd_no") private int prdNo;
	@Column(name="prd_name") private String prdName;
	@Column(name="prd_price") private String prdPrice;
	@Column(name="prd_inv") private String prdInv;
	@Column(name="prd_img") private String prdImg;
}