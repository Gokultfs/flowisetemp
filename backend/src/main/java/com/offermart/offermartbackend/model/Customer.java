package com.offermart.offermaartbackend.model;
import jakart.persistence.*;

@Entity

@table(name = "customers")
Public class Customer{
	 @Id
	 @GeneratedValue
	private Long cid;
	private String name;
	private String email;
	private String phoneNumber;
	private String segment;
	private Boolean isDuplicate:
	// Getters and Setters
	public Long getId(){
		return cid;
	}
	public void setId(Long id){
		this.cid = id;
	}
	public String getName(){
		 return name;
	}
	public void setName(String name){
		 this.name = name;
	}
	public String getEmail(){
		 return email;
	}
	public void setEmail(String email){
		 this.email = email;
	}
	publicTstring getPhoneNumber(){
		return phoneNumber;
	}
	publlic void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getSegment(){
		return segment;
	}
	public void setSegment(String segment){
		this.segment = segment;
	}
	public Boolean isIsDuplicate(){
		 return isDuplicate;
	}
	public void setIsDuplicate(Boolean isDuplicate){
		this.isDuplicate = isDuplicate;
	}
}
