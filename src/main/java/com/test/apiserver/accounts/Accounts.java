package com.test.apiserver.accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length = 20)
	private long seq;
	
	@Column(length = 20)
	private String userName;
	
	@Column(length = 20)
	private String userPass;
	
	public Accounts(String userName, String userPass) {
		this.userName = userName;
		this.userPass = userPass;
	}
}
