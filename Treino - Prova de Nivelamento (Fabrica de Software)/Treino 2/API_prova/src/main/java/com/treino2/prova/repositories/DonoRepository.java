package com.treino2.prova.repositories;

import com.treino2.prova.models.DonoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoRepository extends JpaRepository<DonoModel, Long> {
}
