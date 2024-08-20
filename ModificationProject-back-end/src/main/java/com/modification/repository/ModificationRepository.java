package com.modification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modification.entity.Modification;


@Repository
public interface ModificationRepository extends JpaRepository<Modification, Integer> {

}
