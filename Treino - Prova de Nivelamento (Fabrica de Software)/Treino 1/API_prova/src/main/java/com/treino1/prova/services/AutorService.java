package com.treino1.prova.services;

import com.treino1.prova.models.AutorModel;
import com.treino1.prova.repositories.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorModel save(AutorModel autor) {
        return autorRepository.save(autor);
    }

    public List<AutorModel> findAll() {
        return autorRepository.findAll();
    }

    public Optional<AutorModel> findById(Long id) {
        return autorRepository.findById(id);
    }

    public AutorModel update(AutorModel autor) {
        return autorRepository.save(autor);
    }

    public void deleteById(Long id) {
        autorRepository.deleteById(id);
    }

}
