package com.example.demo.mem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Member {
	@Id @Column(name="mem_no") private int memNo;
	@Column(name="memid") private String memid;
	@Column(name="password") private String password;
}