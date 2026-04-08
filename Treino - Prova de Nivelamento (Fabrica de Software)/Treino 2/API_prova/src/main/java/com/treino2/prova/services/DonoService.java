package com.treino2.prova.services;

import com.treino2.prova.models.DonoModel;
import com.treino2.prova.repositories.DonoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DonoService {
    private final DonoRepository donoRepository;

    public DonoModel save(DonoModel donoModel) {
        return donoRepository.save(donoModel);
    }

    public DonoModel update(DonoModel donoModel) {
        return donoRepository.save(donoModel);
    }

    public List<DonoModel> findAll() {
        return donoRepository.findAll();
    }

    public Optional<DonoModel> findById(Long id) {
        return donoRepository.findById(id);
    }

    public void deleteById(Long id){
        donoRepository.deleteById(id);
    }
}
