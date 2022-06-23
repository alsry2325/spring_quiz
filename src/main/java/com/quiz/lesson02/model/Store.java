package com.quiz.lesson02.model;

import java.util.Date;

public class Store {
		
		private	int	id; 
		private	String	name; 
		private String	phoneNumber;
		private String	address;
		private	String	businessNumber; 
		private	String	introduce; 
		private Date	createdAt;
		private	Date	updatedAt;
		
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public String getBusinessNumber() {
			return businessNumber;
		}
		public String getIntroduce() {
			return introduce;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setBusinessNumber(String businessNumber) {
			this.businessNumber = businessNumber;
		}
		public void setIntroduce(String introduce) {
			this.introduce = introduce;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	
		
		
}
