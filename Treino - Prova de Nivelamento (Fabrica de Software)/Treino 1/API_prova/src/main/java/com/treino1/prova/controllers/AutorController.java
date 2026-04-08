package com.treino1.prova.controllers;

import com.treino1.prova.models.AutorModel;
import com.treino1.prova.services.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/autores")
@CrossOrigin(origins = "*")
public class AutorController {
    private final AutorService autorService;

    @PostMapping
    public AutorModel save(@RequestBody AutorModel autorModel) {
        return autorService.save(autorModel);
    }

    @GetMapping
    public List<AutorModel> findAll() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AutorModel> findById(@PathVariable Long id) {
        return autorService.findById(id);
    }

    @PutMapping
    public AutorModel update(@RequestBody AutorModel autorModel) {
        return autorService.update(autorModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        autorService.deleteById(id);
    }
}
