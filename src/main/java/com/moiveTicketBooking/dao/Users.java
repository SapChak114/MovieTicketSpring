package com.moiveTicketBooking.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String name;
	@Column
	private String age;
	@OneToOne
	@JoinColumn(name="seat_id",referencedColumnName = "id")
	private Seats seatId;
	@OneToOne(mappedBy="userId")
	private Invoices invoice;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public Seats getSeatId() {
		return seatId;
	}
	public void setSeatId(Seats seatId) {
		this.seatId = seatId;
	}
	public Invoices getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoices invoice) {
		this.invoice = invoice;
	}
	
	
}
