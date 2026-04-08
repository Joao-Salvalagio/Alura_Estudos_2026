package com.treino1.prova.repositories;

import com.treino1.prova.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Long> {
}
