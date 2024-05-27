package com.stl.app.restApi.model;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	 private String firstName;
	    private String lastName;
	    private String occupation;
	    private Integer age;
	    @JdbcTypeCode(SqlTypes.JSON)
	    private Address address;
	    
	    public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
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
	    public String getOccupation() {
	        return occupation;
	    }
	    public void setOccupation(String occupation) {
	        this.occupation = occupation;
	    }
	    public Integer getAge() {
	        return age;
	    }
	    public void setAge(Integer age) {
	        this.age = age;
	    }
	 
	    public Address getAddress() {
	        return address;
	    }
	    public void setAddress(Address address) {
	        this.address = address;
	    }
	}

