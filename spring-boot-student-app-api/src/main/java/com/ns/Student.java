package com.ns;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
//@Document
@Entity
public class Student {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	public Student() {

	}
	public Student(String firstName, String lastName) {
		this.id = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;

	}



}
