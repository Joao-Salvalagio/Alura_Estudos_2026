package com.treino2.prova.services;

import com.treino2.prova.models.CarroModel;
import com.treino2.prova.repositories.CarroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarroService {
    private final CarroRepository carroRepository;

    public CarroModel save(CarroModel carroModel) {
        return carroRepository.save(carroModel);
    } //POST

    public CarroModel update(CarroModel carroModel) {
        return carroRepository.save(carroModel);
    } //PUT

    public List<CarroModel> findAll() {
        return carroRepository.findAll();
    } //GET

    public Optional<CarroModel> findById(Long id) {
        return carroRepository.findById(id);
    } //GET PATH

    public void deleteById(Long id){
        carroRepository.deleteById(id);
    } //DELETE PATH
}