package com.neoris.devopstest.app.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestParam {
	private String message;
	@JsonProperty("to")
	private	String toPerson;
	@JsonProperty("from")
	private String fromPerson;
	private String timeToLifeSec;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToPerson() {
		return toPerson;
	}
	public void setToPerson(String toPerson) {
		this.toPerson = toPerson;
	}
	public String getFromPerson() {
		return fromPerson;
	}
	public void setFromPerson(String fromPerson) {
		this.fromPerson = fromPerson;
	}
	public String getTimeToLifeSec() {
		return timeToLifeSec;
	}
	public void setTimeToLifeSec(String timeToLifeSec) {
		this.timeToLifeSec = timeToLifeSec;
	}

}
