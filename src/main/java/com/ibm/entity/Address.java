package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
 
/**
 * This Entity is for Customer's address
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aid")
	private Long aid;

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pin_code")
	private String pinCode;

	@Column(name = "sonnetRegisteredId")
	private Long sonnetRegisteredId;

	@JsonBackReference
	@OneToOne
	@PrimaryKeyJoinColumn
	private Order order;

	// Default Constructor
	public Address() {
		super();
	}

	// Constructor using fields
	public Address(Long aid, String street, String city, String state, String country, String pinCode,
			Long sonnetRegisteredId, Order order) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.sonnetRegisteredId = sonnetRegisteredId;
		this.order = order;
	}

	public Long getAid() {
		return aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Long getSonnetRegisteredId() {
		return sonnetRegisteredId;
	}

	public void setSonnetRegisteredId(Long sonnetRegisteredId) {
		this.sonnetRegisteredId = sonnetRegisteredId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	



	
}