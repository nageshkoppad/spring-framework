package com.xworkz.bikes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name="red")
@NamedQuery(name = "findByLocation",query = "select temple from BikesEntity temple where temple.location=:lk")
public class BikesEntity {
	@Id
	private String brand;
	private String owner;
	private String location;
	private String  ambassador;
	private String descsription;
}
