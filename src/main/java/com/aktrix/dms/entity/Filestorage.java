package com.aktrix.dms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

import jakarta.persistence.Column;

@Entity
public class Filestorage {

	@Id
	@Column(name = "did")
	private Long did;

	@Column(name = "drenditionid")
	private String drenditionid;

	@Column(name = "dlastmodified")
	private Date dlastmodified;

	@Column(name = "dfilesize")
	private Long dfilesize;

	@Column(name = "disdeleted")
	private String disdeleted;

	@Column(name = "bfiledata")
	private byte[] bfiledata;

	public Long getDid() {
		return did;
	}

	public String getDrenditionid() {
		return drenditionid;
	}

	public Date getDlastmodified() {
		return dlastmodified;
	}

	public Long getDfilesize() {
		return dfilesize;
	}

	public String getDisdeleted() {
		return disdeleted;
	}

	public byte[] getBfiledata() {
		return bfiledata;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public void setDrenditionid(String drenditionid) {
		this.drenditionid = drenditionid;
	}

	public void setDlastmodified(Date dlastmodified) {
		this.dlastmodified = dlastmodified;
	}

	public void setDfilesize(Long dfilesize) {
		this.dfilesize = dfilesize;
	}

	public void setDisdeleted(String disdeleted) {
		this.disdeleted = disdeleted;
	}

	public void setBfiledata(byte[] bfiledata) {
		this.bfiledata = bfiledata;
	}
	
	

}