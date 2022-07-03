package com.moiveTicketBooking.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class Invoices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id", referencedColumnName = "id")
	private Theatre theatreId;
	@OneToOne
	@JoinColumn(name="user_id", referencedColumnName = "id")
	private Users userId;
	@Column
	private String actionBy;
	
	@Column
	private String discount;
	
	@Column
	private String tax;
	
	@Column
	private String totalPrice;
	
	@Column
	private String totalBeforeDiscount;
	
	@Column
	private String braintreeTransactionId;
	
	@Column
	private Date billingDate;
	
	@Column
	private Date billingDueDate;
	
	@Column(columnDefinition="tinyint(1) default 0")
	private boolean isDuePaid;
	
	@Column(unique=true)
	private String invoiceId;
	
	@Column(columnDefinition="TEXT")
	private String message;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Theatre getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Theatre theatreId) {
		this.theatreId = theatreId;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalBeforeDiscount() {
		return totalBeforeDiscount;
	}

	public void setTotalBeforeDiscount(String totalBeforeDiscount) {
		this.totalBeforeDiscount = totalBeforeDiscount;
	}

	public String getBraintreeTransactionId() {
		return braintreeTransactionId;
	}

	public void setBraintreeTransactionId(String braintreeTransactionId) {
		this.braintreeTransactionId = braintreeTransactionId;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public Date getBillingDueDate() {
		return billingDueDate;
	}

	public void setBillingDueDate(Date billingDueDate) {
		this.billingDueDate = billingDueDate;
	}

	public boolean isDuePaid() {
		return isDuePaid;
	}

	public void setDuePaid(boolean isDuePaid) {
		this.isDuePaid = isDuePaid;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}
	
	
}
