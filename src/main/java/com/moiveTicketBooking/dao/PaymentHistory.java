package com.moiveTicketBooking.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class PaymentHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String paymentAmount;
	
	@Column
	private String paymentMethod;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payed_by", referencedColumnName = "id")
	private Users payedBy;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre_id", referencedColumnName = "id")
	private Theatre theatreId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoice_id", referencedColumnName = "id")
	private Invoices invoiceId;
	
	@Column
	private Date paymentDate;
	
	@Column
	private String billingPeriod;
	
	@Column(columnDefinition="tinyint(1) default 0")
	private boolean isSuccess;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Users getPayedBy() {
		return payedBy;
	}

	public void setPayedBy(Users payedBy) {
		this.payedBy = payedBy;
	}

	public Theatre getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Theatre theatreId) {
		this.theatreId = theatreId;
	}

	public Invoices getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Invoices invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
}
