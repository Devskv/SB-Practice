package com.devuse.docker.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="ticket")
public class Ticket {
	
	@EmbeddedId
	private TicketId ticketId;
	
	//@Column(name="seatNumber")
	private Integer seatNumber;
	
	//@Column(name="isConfirmed")
	private Boolean isConfirmed;
	
	public Ticket() {
	}

	public Ticket(TicketId ticketId, Integer seatNumber, Boolean isConfirmed) {
		this.ticketId = ticketId;
		this.seatNumber = seatNumber;
		this.isConfirmed = isConfirmed;
	}

	public TicketId getTicketId() {
		return ticketId;
	}

	public void setTicketId(TicketId ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Boolean getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	
	

}
