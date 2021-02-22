package com.example.demo.brd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
public class Board {
	@Id @Column(name="brd_no") private int brdNo;
	@Column(name="brd_Title") private String  brdTitle;
	@Column(name="brd_content") private String brdContent;
	@Column(name="brd_written_date") private String brdwrittenDate;
	@Column(name="brd_rank") private String brdRank;


}
