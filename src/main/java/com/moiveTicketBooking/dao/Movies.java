package com.moiveTicketBooking.dao;

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

@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column
	private String name;
	@Column
	private String startTime;
	@Column
	private String endTime;
	@Column
	private String duration;
	@Column
	private String date;
	@Column
	private String langauge;
	@ManyToOne
	@JoinColumn(name="hallId", referencedColumnName = "id")
	private Halls hallId; 
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "movieId")
	List<Seats> seats;
	@Column(columnDefinition="tinyint(1) default 0")
	
	
	private Boolean isMovieRunning;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLangauge() {
		return langauge;
	}
	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	public Halls getHallId() {
		return hallId;
	}
	public void setHallId(Halls hallId) {
		this.hallId = hallId;
	}
	public List<Seats> getSeats() {
		return seats;
	}
	public void setSeats(List<Seats> seats) {
		this.seats = seats;
	}
	public Boolean getIsMovieRunning() {
		return isMovieRunning;
	}
	public void setIsMovieRunning(Boolean isMovieRunning) {
		this.isMovieRunning = isMovieRunning;
	}
	
}
