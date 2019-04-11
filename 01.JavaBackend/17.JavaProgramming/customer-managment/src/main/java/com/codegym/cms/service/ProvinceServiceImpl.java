package com.codegym.cms.service;

import com.codegym.cms.model.Province;
import com.codegym.cms.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository repository;

    @Override
    public Iterable<Province> findAll() {
        return repository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void save(Province province) {
        repository.save(province);
    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }
}
