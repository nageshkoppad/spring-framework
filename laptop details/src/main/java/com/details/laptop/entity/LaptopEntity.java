package com.details.laptop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="laptop")
public class LaptopEntity {

	@Id
	private String brand;
	private int ram;
	private String processor;
	private int rom; 
}
