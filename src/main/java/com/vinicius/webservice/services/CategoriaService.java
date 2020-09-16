package com.vinicius.webservice.services;

import com.vinicius.webservice.domain.Categoria;
import com.vinicius.webservice.domain.Produto;
import com.vinicius.webservice.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

}
