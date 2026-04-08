package com.treino2.prova.controllers;

import com.treino2.prova.models.CarroModel;
import com.treino2.prova.services.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/carro")
@CrossOrigin("*")
public class CarroController {
    private final CarroService carroService;

    @PostMapping
    public CarroModel save(@RequestBody CarroModel carroModel) {
        return carroService.save(carroModel);
    }

    @PutMapping
    public CarroModel update(@RequestBody CarroModel carroModel) {
        return carroService.update(carroModel);
    }

    @GetMapping
    public List<CarroModel> findAll() {
        return carroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CarroModel> findById(@PathVariable Long id) {
        return carroService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        carroService.deleteById(id);
    }
}
