package com.azan.app.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class AddEventModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private BigInteger eventId; 
	private String eventName;
	private String eventDate;
	private String eventDetailsWrite;
	
	
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventDetailsWrite() {
		return eventDetailsWrite;
	}
	public void setEventDetailsWrite(String eventDetailsWrite) {
		this.eventDetailsWrite = eventDetailsWrite;
	}
	public BigInteger getEventId() {
		return eventId;
	}
	public void setEventId(BigInteger eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	

}
