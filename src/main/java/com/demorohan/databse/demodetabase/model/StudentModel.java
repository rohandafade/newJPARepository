package com.demorohan.databse.demodetabase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity

@Table(name="Rohan_Student")
@NamedQuery(name="Find_all_Students",query="select s from StudentModel s")
public class StudentModel {
	

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="Student_Name")
	private String name;
	
	@Column(name="Student_Address")
	private String address;
	
	
	@Column(name="Contact_No")
	private long number;


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}

	

	public long getNumber() {
		return number;
	}

	public StudentModel() {
		
	}


		public StudentModel(String name, String address, long number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}

		public StudentModel(int id, String name, String address, long number) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.number = number;
		}


}
