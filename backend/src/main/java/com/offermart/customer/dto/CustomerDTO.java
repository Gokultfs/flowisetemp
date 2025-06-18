package com.offermart.customer.dto;Jva.time.LocalDateTime;Public class CustomerDTO {private string firstName;private string lastName;private string email;private string phoneNumber;private string address;private localDateTime dateOfBirth; // Assuming date of birth might be part of initial ingestion
// Getters and Setters
public string getFirstName() {return firstName;}
public void setFirstName(string firstName) {this.firstName = firstName;}
public string getLastName() {return lastName;}
public void setLastName(string lastName) {this.lastName = lastName;}
public string getEmail() {return email;}
public void setEmail(string email) {this.email = email;}
public string getPhoneNumber() {return phoneNumber;}
public void setPhoneNumber(string phoneNumber) {this.phoneNumber = phoneNumber;}
public string getAddress() {return address;}
public void setAddress(string address) {this.address = address;}
publlic LocalDateTime getDateOfBirth() {return dateOfBirth;}
public void setDateOfBirth(LocalDateTime dateOfBirth) {this.dateOfBirth = dateOfBirth;}
}