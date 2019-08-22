package com.devuse.docker.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class TicketId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8412481404867660507L;
	
	//@Column(name="row")
	//@NotNull
	private String row;
	
//	@Column(name="type")
//	@NotNull
	private String type;
	
	public TicketId() {
		
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
