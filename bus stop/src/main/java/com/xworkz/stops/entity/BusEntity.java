package com.xworkz.stops.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "stop")
@NoArgsConstructor
public class BusEntity {
	@Id
	private String name;
	private String location;
	private int since;
}
