package com.modification.service;

import java.util.List;
import java.util.Optional;

import com.modification.entity.Modification;

public interface ModificationService {
    List<Modification> findAll();
    Optional<Modification> findById(int id);
    Modification save(Modification modification);
    void delete(int id);
}
