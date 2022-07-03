package com.moiveTicketBooking.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Seats {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String seatNo;
	@Column
	private String rowNo;
	@Column
	private String seatCategory;
	@ManyToOne
	@JoinColumn(name="hallId",referencedColumnName = "id")
	private Halls hallId;
	@ManyToOne
	@JoinColumn(name="movieId",referencedColumnName = "id", insertable = true, updatable = true)
	private Movies movieId;
	@OneToMany
	@JoinColumn(name="food", referencedColumnName = "id", insertable = true, updatable = true)
	private List<Food> food;
	@Column(columnDefinition="tinyint(1) default 0")
	private Boolean isSeatBooked;
	@Column
	private String bookingId;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "seatId")
	private Users user;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getRowNo() {
		return rowNo;
	}
	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
	}
	public String getSeatCategory() {
		return seatCategory;
	}
	public void setSeatCategory(String seatCategory) {
		this.seatCategory = seatCategory;
	}
	public Movies getMovieId() {
		return movieId;
	}
	public void setMovieId(Movies movieId) {
		this.movieId = movieId;
	}
	
	public List<Food> getFood() {
		return food;
	}
	public void setFood(List<Food> food) {
		this.food = food;
	}
	public Boolean getIsSeatBooked() {
		return isSeatBooked;
	}
	public void setIsSeatBooked(Boolean isSeatBooked) {
		this.isSeatBooked = isSeatBooked;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Halls getHallId() {
		return hallId;
	}
	public void setHallId(Halls hallId) {
		this.hallId = hallId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	

}
