package com.example.demo.brd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity @Table(name="boards")
public class Board {
	@Id @Column(name="brd_no") @GeneratedValue(strategy = GenerationType.AUTO) private int brdNo;
	@Column(name="brd_Title") private String  brdTitle;
	@Column(name="brd_content") private String brdContent;
	@Column(name="brd_written_date") private String brdwrittenDate;
	@Column(name="brd_rank") private String brdRank;
	@Column(name="brd_img") private String brdImg;
	@Column(name="brd_kind") private int brdKind;
	@Column(name="brd_mod_data") private String brdModData;
	@Column(name="brd_count") private int count;
	@Column(name="brd_like") private int brdLike;

}
