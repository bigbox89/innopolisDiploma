package com.gitlab.ufapetr.repositories;

import com.gitlab.ufapetr.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PartsRepository extends JpaRepository<Part, Integer> {
    List<Part> findAll();
}
