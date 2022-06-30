package com.quiz.lesson04.model;

import java.util.Date;

public class Realtor {

		private	int	id;
		private	String	office;
		private	String	phoneNumber;
		private	String	address;
		private	String	grade;
		private	Date	createdAt;
		private	Date	updatedAt;
		
		
		public int getId() {
			return id;
		}
		public String getOffice() {
			return office;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public String getGrade() {
			return grade;
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
		public void setOffice(String office) {
			this.office = office;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		
		
		
	
}
