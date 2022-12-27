package com.hospital.near.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="patient2")
@NamedQuery(name = "findByName",query = "select patient from PatientEntity patient where patient.name=:na")
@NamedQuery(name = "findByAgeGreaterThan",query = "select patient from PatientEntity patient where patient.age>=:gre")
@NamedQuery(name = "findByAgeLesserThan",query = "select patient from PatientEntity patient where patient.age<=:les")
public class PatientEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idNo;
	private String name;
	private String email;
	private int age;
	private String mobile;
	private String gender;
	private String id;
	private String idValue;
	private String bplCard;
	private String incurance;

}
