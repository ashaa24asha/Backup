package com.stl.app.restApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int houseNumber;
    private String road;
    private String city;
    private String state;
    private int pincode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
    
 
}

//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "address")
//public class Address {
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private Long id;
//
//	    private int houseNumber;
//	    private String road;
//	    private String city;
//	    private String state;
//	    private int pincode;
//		public Long getId() {
//			return id;
//		}
//		public void setId(Long id) {
//			this.id = id;
//		}
//		public int getHouseNumber() {
//			return houseNumber;
//		}
//		public void setHouseNumber(int houseNumber) {
//			this.houseNumber = houseNumber;
//		}
//		public String getRoad() {
//			return road;
//		}
//		public void setRoad(String road) {
//			this.road = road;
//		}
//		public String getCity() {
//			return city;
//		}
//		public void setCity(String city) {
//			this.city = city;
//		}
//		public String getState() {
//			return state;
//		}
//		public void setState(String state) {
//			this.state = state;
//		}
//		public int getPincode() {
//			return pincode;
//		}
//		public void setPincode(int pincode) {
//			this.pincode = pincode;
//		}
//
//	    // Getters and setters
//	    
//	}
//
//
