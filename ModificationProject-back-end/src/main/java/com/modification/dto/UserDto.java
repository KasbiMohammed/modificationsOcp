package com.modification.dto;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private int role;
    @Lob
    private byte[] photo;

}
