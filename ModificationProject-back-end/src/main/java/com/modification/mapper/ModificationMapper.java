package com.modification.mapper;

import com.modification.dto.ModificationDto;
import com.modification.entity.Modification;
import com.modification.dto.UserDto;
import com.modification.entity.User;

public class ModificationMapper {

    public static ModificationDto toDto(Modification modification) {
        if (modification == null) {
            return null;
        }
        ModificationDto dto = new ModificationDto();
        dto.setId(modification.getId());
        dto.setAtelier(modification.getAtelier());
        dto.setDate(modification.getDate());
        dto.setObjet(modification.getObjet());
        dto.setDescription(modification.getDescription());
        dto.setService1(modification.getService1());
        dto.setService2(modification.getService2());
        dto.setPhotoAvantModification(modification.getPhotoAvantModification());
        dto.setPhotoApresModification(modification.getPhotoApresModification());
        dto.setUser(UserMapper.toDto(modification.getUser())); // Assuming UserMapper is implemented
        return dto;
    }

    public static Modification toEntity(ModificationDto dto) {
        if (dto == null) {
            return null;
        }
        Modification modification = new Modification();
        modification.setId(dto.getId());
        modification.setAtelier(dto.getAtelier());
        modification.setDate(dto.getDate());
        modification.setObjet(dto.getObjet());
        modification.setDescription(dto.getDescription());
        modification.setService1(dto.getService1());
        modification.setService2(dto.getService2());
        modification.setPhotoAvantModification(dto.getPhotoAvantModification());
        modification.setPhotoApresModification(dto.getPhotoApresModification());
        modification.setUser(UserMapper.toEntity(dto.getUser())); // Assuming UserMapper is implemented
        return modification;
    }
}
