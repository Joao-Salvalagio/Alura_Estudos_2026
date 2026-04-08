package com.treino2.prova.controllers;

import com.treino2.prova.models.DonoModel;
import com.treino2.prova.services.DonoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dono")
@CrossOrigin("*")
public class DonoController {
    private final DonoService donoService;

    @PostMapping
    public DonoModel save(@RequestBody DonoModel donoModel) {
        return donoService.save(donoModel);
    }

    @PutMapping
    public DonoModel update(@RequestBody DonoModel donoModel) {
        return donoService.update(donoModel);
    }

    @GetMapping
    public List<DonoModel> findAll() {
        return donoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DonoModel> findById(@PathVariable Long id) {
        return donoService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        donoService.deleteById(id);
    }
}
