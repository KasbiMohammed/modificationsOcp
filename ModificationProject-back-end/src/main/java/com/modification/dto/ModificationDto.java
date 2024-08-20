package com.modification.dto;

import java.sql.Date;

import com.modification.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModificationDto {
	    private int id;
		private String atelier;
		private Date date;
		private String objet;
		private String description;
		private String service1;
		private String service2;
		private byte[] photoAvantModification;
		private byte[] photoApresModification;
		private UserDto user;

}
