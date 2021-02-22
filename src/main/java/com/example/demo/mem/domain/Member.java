package com.example.demo.mem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Member {
	@Id @Column(name="mem_no") private int memNo;
	@Column(name="mem_level") private String memLevel;
	@Column(name="mem_name") private String memName;
	@Column(name="mem_id") private String memId;
	@Column(name="mem_password") private String memPassword;
}