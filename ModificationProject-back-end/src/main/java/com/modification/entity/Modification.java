package com.modification.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modification {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String atelier;
	@DateTimeFormat
	private Date date;
	private String objet;
	private String description;
	private String service1;
	private String service2;
	@Lob
	private byte[] photoAvantModification;
	@Lob
	private byte[] photoApresModification;
   @ManyToOne
   private User user;

}
