package com.example.crudspringboot.service;

import com.example.crudspringboot.entity.Mobile;
import com.example.crudspringboot.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileService implements IMobileService {

    @Autowired
    MobileRepository repository;

    @Override
    public String post(Mobile mobile) {
        repository.save(mobile);
        return "success";
    }

    @Override
    public Optional<Mobile> getOne(long mobileId) {
        return repository.findById(mobileId);
    }

    @Override
    public List<Mobile> getAll() {
        return repository.findAll();
    }

    @Override
    public String delete(long mobileId) {
        repository.deleteById(mobileId);
        return "Success";
    }
}
