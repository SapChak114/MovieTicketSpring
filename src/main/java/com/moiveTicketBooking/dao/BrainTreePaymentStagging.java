package com.moiveTicketBooking.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrainTreePaymentStagging {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column
	private String tokenId;

	@Column
	private String invoiceIdRef;

	@Column(name = "payment_sys_customer_id", length = 100)
	private String paymentSysCustomerId;
	@Column(name = "payment_sys_txn_id", length = 100)
	
	private String paymentSysTxnId;

	@Column
	private String paymentStatus;
	
	@Column
	private String paymentStatusMsg;
	
	@Column
	private String braintreePlanId;
	
	@Column
	private String paymentAmt;

	@Column(columnDefinition="tinyint(1) default 0")
	private Boolean isPaymentSuccess;
}
