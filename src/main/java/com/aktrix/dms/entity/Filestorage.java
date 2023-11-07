package com.aktrix.dms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Filestorage {
	@Column(name = "BFILEDATA")
	private byte[] bfiledata;
	@Id
	@Column(name = "did")
	private Long did;
	
	public byte[] getBfiledata() {
		return bfiledata;
	}
	public Long getDid() {
		return did;
	}
	public void setBfiledata(byte[] bfiledata) {
		this.bfiledata = bfiledata;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	
	

}
