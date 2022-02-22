package com.example.crudspringboot.service;

import com.example.crudspringboot.entity.Mobile;

import java.util.List;
import java.util.Optional;

public interface IMobileService {
    String post(Mobile mobile);

    Optional<Mobile> getOne(long mobileId);

    List<Mobile> getAll();

    String delete(long mobileId);
}
