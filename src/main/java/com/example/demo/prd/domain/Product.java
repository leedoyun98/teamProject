package com.example.demo.prd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	@Id @Column(name="prd_id") private int prdId;
	@Column(name="prd_name") private String prdName;
	@Column(name="price") private String price;
	@Column(name="inventory") private String inventory;
}