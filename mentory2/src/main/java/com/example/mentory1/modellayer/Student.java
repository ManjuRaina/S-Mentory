package com.example.mentory1.modellayer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stud_id;
	private String stud_name;
	private Long stud_no;
	private String stud_address;
	private String stud_email;
	private String stud_password;
	
	
	public Integer getStud_id() {
		return stud_id;
	}
	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public Long getStud_no() {
		return stud_no;
	}
	public void setStud_no(Long stud_no) {
		this.stud_no = stud_no;
	}
	public String getStud_address() {
		return stud_address;
	}
	public void setStud_address(String stud_address) {
		this.stud_address = stud_address;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getStud_password() {
		return stud_password;
	}
	public void setStud_password(String stud_password) {
		this.stud_password = stud_password;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_no=" + stud_no + ", stud_address="
				+ stud_address + ", stud_email=" + stud_email + ", stud_password=" + stud_password + "]";
	}
	
	
	
	
	
 
}
