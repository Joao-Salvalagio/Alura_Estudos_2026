package com.treino1.prova.services;

import com.treino1.prova.models.LivroModel;
import com.treino1.prova.repositories.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroModel save(LivroModel livro) {
        return livroRepository.save(livro);
    }
    public List<LivroModel> findAll() {
        return livroRepository.findAll();
    }

    public Optional<LivroModel> findById(Long id) {
        return livroRepository.findById(id);
    }

    public LivroModel update(LivroModel livro) {
        return livroRepository.save(livro);
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }
}
