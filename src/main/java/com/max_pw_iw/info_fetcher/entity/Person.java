package com.max_pw_iw.info_fetcher.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id","firstName","lastName","age","sex"})
public class Person {
    
    @Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonValue()
	private long id;

	@Column(nullable = false, unique = true)
	private String firstName;

	@Column(nullable = false, unique = true)
	private String lastName;

	@Column(nullable = false, unique = true)
	private int age;

	@Column(nullable = false, unique = true)
	private String sex;

}
