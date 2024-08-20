package com.modification.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.modification.entity.Modification;
import com.modification.service.ModificationService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/modifications")
public class ModificationController {

    @Autowired
    private ModificationService modificationService;

    @GetMapping
    public List<Modification> getAllModifications() {
        return modificationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Modification> getModificationById(@PathVariable int id) {
        Optional<Modification> modification = modificationService.findById(id);
        return modification.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Modification createModification(@RequestBody Modification modification) {
        return modificationService.save(modification);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Modification> updateModification(@PathVariable int id, @RequestBody Modification modification) {
        if (!modificationService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        modification.setId(id);
        return ResponseEntity.ok(modificationService.save(modification));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModification(@PathVariable int id) {
        if (!modificationService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        modificationService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
