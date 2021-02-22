package com.example.demo.brd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.ord.domain.Order;
import com.example.demo.prd.domain.Product;
import com.example.demo.rpl.domain.Reply;
import com.example.demo.usr.domain.User;

import java.util.ArrayList;
import java.util.List;


@Entity @Table(name="boards")
public class Board {
	@Id @Column(name="brd_no") @GeneratedValue(strategy = GenerationType.AUTO) private int brdNo;
	@Column(name="brd_Title") private String  brdTitle;
	@Column(name="brd_content") private String brdContent;
	@Column(name="brd_written_date") private String brdwrittenDate;
	@Column(name="brd_rank") private String brdRank;
	@Column(name="brd_img") private String brdImg;
	@Column(name="brd_kind") private int brdKind;
	@Column(name="brd_mod_data") private String brdModDate;
	@Column(name="brd_count") @GeneratedValue(strategy = GenerationType.AUTO) private int count;
	@Column(name="brd_like") private int brdLike;
	@Column(name="brd_pwd") private int brdPwd;
	
	@OneToMany(mappedBy="board")
	private List<Reply> replyList = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="usr_no")
	private User user;
	@ManyToOne
	@JoinColumn(name="ord_no")
	private Order order;
	@ManyToOne
	@JoinColumn(name="prd_no")
	private Product product;
	
}
