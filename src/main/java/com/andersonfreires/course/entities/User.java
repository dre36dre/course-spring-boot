package com.andersonfreires.course.entities;

import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_user")
public class User implements Serializable   {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	private String nameString;
	private String emailString;
	private String phoneString;
	private String passwordString;
	
	@OneToMany(mappedBy = "clientUser")
	private List<Order> orders=new ArrayList<>();
	
	public List<Order> getOrders() {
		return orders;
	}
	
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
