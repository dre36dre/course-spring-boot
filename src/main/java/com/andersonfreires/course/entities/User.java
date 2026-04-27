package com.andersonfreires.course.entities;

import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.Objects;

public class User implements Serializable   {
	
	private static final long serialVersionUID = 1L;
	private Long idLong;
	private String nameString;
	private String emailString;
	private String phoneString;
	private String passwordString;
	public User() {
		super();
	}
	public User(Long idLong, String nameString, String emailString, String phoneString, String passwordString) {
		super();
		this.idLong = idLong;
		this.nameString = nameString;
		this.emailString = emailString;
		this.phoneString = phoneString;
		this.passwordString = passwordString;
	}
	public Long getIdLong() {
		return idLong;
	}
	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	public String getPasswordString() {
		return passwordString;
	}
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idLong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(idLong, other.idLong);
	}
	
	
	

}
