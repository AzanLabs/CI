package com.azan.app.persistance.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;


/**
 * The persistent class for the church_additional_info database table.
 * 
 */
@Entity
@Table(name="church_additional_info")
public class ChurchAdditionalInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="church_id")
	private BigInteger churchId;

	@Lob
	@Column(name="church_history")
	private String churchHistory;

	@Lob
	@Column(name="church_intro")
	private String churchIntro;

	@Lob
	@Column(name="church_vision")
	private String churchVision;

	//bi-directional one-to-one association to ChurchInfo
	@OneToOne
	@JoinColumn(name="church_id")
	private ChurchInfo churchInfo;

	public ChurchAdditionalInfo() {
	}

	

	public BigInteger getChurchId() {
		return churchId;
	}



	public void setChurchId(BigInteger churchId) {
		this.churchId = churchId;
	}



	public String getChurchHistory() {
		return this.churchHistory;
	}

	public void setChurchHistory(String churchHistory) {
		this.churchHistory = churchHistory;
	}

	public String getChurchIntro() {
		return this.churchIntro;
	}

	public void setChurchIntro(String churchIntro) {
		this.churchIntro = churchIntro;
	}

	public String getChurchVision() {
		return this.churchVision;
	}

	public void setChurchVision(String churchVision) {
		this.churchVision = churchVision;
	}

	public ChurchInfo getChurchInfo() {
		return this.churchInfo;
	}

	public void setChurchInfo(ChurchInfo churchInfo) {
		this.churchInfo = churchInfo;
	}

}