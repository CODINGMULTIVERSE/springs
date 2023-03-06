package com.service;

 
	import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.matireal.material;
import com.repo.repo;

	 
@Service
public class  service {
    private final repo repository;

    public service(repo productRepository) {
        this.repository = productRepository;
    }

    public List<material> findAll() {
        return repository.findAll();
    }

    public Optional<material> findById(Long id) {
        return repository.findById(id);
    }

    public material save(material product) {
        return repository.save(product);
    }

    public void deleteById(Long id) {
    	repository.deleteById(id);
    }
}