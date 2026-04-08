package com.treino1.prova.controllers;

import com.treino1.prova.models.LivroModel;
import com.treino1.prova.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/livros")
@CrossOrigin(origins = "*")
public class LivroController {
    private final LivroService livroService;

    @PostMapping
    public LivroModel save(@RequestBody LivroModel livroModel) {
        return livroService.save(livroModel);
    }

    @GetMapping
    public List<LivroModel> findAll() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<LivroModel> findById(@PathVariable Long id) {
        return livroService.findById(id);
    }

    @PutMapping
    public LivroModel update(@RequestBody LivroModel livroModel) {
        return livroService.update(livroModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        livroService.deleteById(id);
    }
}
