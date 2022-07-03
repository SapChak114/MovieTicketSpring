package com.moiveTicketBooking.dao;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Halls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String hallNo;
	@Column
	private String hallFloor;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "hallId")
	private List<Movies> movie;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="theatreId",referencedColumnName = "id", insertable = true, updatable = true)
	private Theatre theatreId;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "hallId")
	Set<Seats> seats;
	@Column(columnDefinition="tinyint(1) default 0")
	private Boolean isHouseFull;
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
	public String getHallNo() {
		return hallNo;
	}
	public void setHallNo(String hallNo) {
		this.hallNo = hallNo;
	}
	public String getHallFloor() {
		return hallFloor;
	}
	public void setHallFloor(String hallFloor) {
		this.hallFloor = hallFloor;
	}
	public Theatre getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Theatre theatreId) {
		this.theatreId = theatreId;
	}
	public Set<Seats> getSeats() {
		return seats;
	}
	public void setSeats(Set<Seats> seats) {
		this.seats = seats;
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
	public Boolean getIsHouseFull() {
		return isHouseFull;
	}
	public void setIsHouseFull(Boolean isHouseFull) {
		this.isHouseFull = isHouseFull;
	}
	public List<Movies> getMovie() {
		return movie;
	}
	public void setMovie(List<Movies> movie) {
		this.movie = movie;
	}
	
	
}
