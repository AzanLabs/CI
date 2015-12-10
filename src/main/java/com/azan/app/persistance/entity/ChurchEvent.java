package com.azan.app.persistance.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the church_events database table.
 * 
 */
@Entity
@Table(name="church_events")
@NamedQuery(name="ChurchEvent.findAll", query="SELECT c FROM ChurchEvent c")
public class ChurchEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="churh_id")
	private BigInteger churhId;

	@Temporal(TemporalType.DATE)
	@Column(name="event_date")
	private Date eventDate;

	@Column(name="event_details_write")
	private String eventDetailsWrite;

	@Column(name="event_name")
	private String eventName;

	public ChurchEvent() {
	}

	public BigInteger getChurhId() {
		return this.churhId;
	}

	public void setChurhId(BigInteger churhId) {
		this.churhId = churhId;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventDetailsWrite() {
		return this.eventDetailsWrite;
	}

	public void setEventDetailsWrite(String eventDetailsWrite) {
		this.eventDetailsWrite = eventDetailsWrite;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

}