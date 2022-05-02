package com.ecommerce.sportsshoe.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;
@Entity
@Table(name = "admin_tbl")
@EnableTransactionManagement

public class AdminModel {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "userID")
		private int user_ID;
		
		@Column(name = "userName")
		private String user_Name;
		
		@Column(name = "userEmail")
		private String user_Email;
		
		@Column(name = "password")
		private long password;

		public int getUser_ID() {
			return user_ID;
		}

		public void setUser_ID(int user_ID) {
			this.user_ID = user_ID;
		}

		public String getUser_Name() {
			return user_Name;
		}

		public void setUser_Name(String user_Name) {
			this.user_Name = user_Name;
		}

		public String getUser_Email() {
			return user_Email;
		}

		public void setUser_Email(String user_Email) {
			this.user_Email = user_Email;
		}

		public long getPassword() {
			return password;
		}

		public void setPassword(long password) {
			this.password = password;
		}
		
}
