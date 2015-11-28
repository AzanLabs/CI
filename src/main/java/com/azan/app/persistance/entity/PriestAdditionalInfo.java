package com.azan.app.persistance.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;


/**
 * The persistent class for the priest_additional_info database table.
 * 
 */
@Entity
@Table(name="priest_additional_info")
public class PriestAdditionalInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="priest_id")
	private BigInteger priestId;

	@Lob
	@Column(name="priest_info")
	private String priestInfo;

	//bi-directional one-to-one association to PriestInfo
	@OneToOne
	@JoinColumn(name="priest_id")
	private PriestInfo priestInfoBean;

	public PriestAdditionalInfo() {
	}

	public BigInteger getPriestId() {
		return this.priestId;
	}

	public void setPriestId(BigInteger priestId) {
		this.priestId = priestId;
	}

	public String getPriestInfo() {
		return this.priestInfo;
	}

	public void setPriestInfo(String priestInfo) {
		this.priestInfo = priestInfo;
	}

	public PriestInfo getPriestInfoBean() {
		return this.priestInfoBean;
	}

	public void setPriestInfoBean(PriestInfo priestInfoBean) {
		this.priestInfoBean = priestInfoBean;
	}

	
}