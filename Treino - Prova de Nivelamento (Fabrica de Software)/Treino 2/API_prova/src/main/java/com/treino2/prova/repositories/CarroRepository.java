package com.treino2.prova.repositories;

import com.treino2.prova.models.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
