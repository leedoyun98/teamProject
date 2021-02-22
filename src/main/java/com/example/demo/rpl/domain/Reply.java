package com.example.demo.rpl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.brd.domain.Board;
import com.example.demo.usr.domain.User;

@Entity @Table(name="replier")
public class Reply {
	@Id @Column(name="rpl_no") private int rplNo;
	@Column(name="rpl_content") private String rplContent;
	
	
	@ManyToOne
	@JoinColumn(name="brd_no")
	private Board board;

	@ManyToOne
	@JoinColumn(name = "usr_no")
	private User user;
	

}
