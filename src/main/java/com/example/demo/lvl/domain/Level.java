package com.example.demo.lvl.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lvls")
public class Level {

	@Id
	@Column(name = "level")
	private int level;

}
