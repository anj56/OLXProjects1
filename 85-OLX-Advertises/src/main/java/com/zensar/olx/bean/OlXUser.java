package com.zensar.olx.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;

import org.springframework.lang.NonNull;


@Embeddable
public class OlXUser {
	
	
	@Column(name = "olx_user_id")
	private int olxuserId;
	
	@Transient
	private String firstName;
	
	@Transient
	private String lastName;
	 
	@Transient
	private String userName;
	
	@Transient
	
	private Active active;
	
	@Transient
	private String password;
	
	@Transient
	private String emailId;
	
	@Transient
	private String phoneNumber;
	
	@Transient
	private String roles;

	public OlXUser() {
		super();
	}

	public OlXUser(int olxuserId) {
		super();
		this.olxuserId = olxuserId;
	}

	public OlXUser(int olxuserId, String firstName, String lastName, String userName, Active active, String password,
			String emailId, String phoneNumber, String roles) {
		super();
		this.olxuserId = olxuserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
	}

	public OlXUser(String firstName, String lastName, String userName, Active active, String password, String emailId,
			String phoneNumber, String roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.active = active;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
	}

	public int getOlxuserId() {
		return olxuserId;
	}

	public void setOlxuserId(int olxuserId) {
		this.olxuserId = olxuserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Active getActive() {
		return active;
	}

	public void setActive(Active active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "OlXUser [olxuserId=" + olxuserId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", active=" + active + ", password=" + password + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(olxuserId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OlXUser other = (OlXUser) obj;
		return olxuserId == other.olxuserId;
	}
	
	

}
