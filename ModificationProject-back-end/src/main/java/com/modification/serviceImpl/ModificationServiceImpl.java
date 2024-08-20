package com.modification.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modification.entity.Modification;
import com.modification.repository.ModificationRepository;
import com.modification.service.ModificationService;

@Service
public class ModificationServiceImpl implements ModificationService {

    @Autowired
    private ModificationRepository modificationRepository;

    @Override
    public List<Modification> findAll() {
        return modificationRepository.findAll();
    }

    @Override
    public Optional<Modification> findById(int id) {
        return modificationRepository.findById(id);
    }

    @Override
    public Modification save(Modification modification) {
        return modificationRepository.save(modification);
    }

    @Override
    public void delete(int id) {
        modificationRepository.deleteById(id);
    }
}
