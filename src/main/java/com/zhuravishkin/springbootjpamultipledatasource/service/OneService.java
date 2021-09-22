package com.zhuravishkin.springbootjpamultipledatasource.service;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OneEntity;
import com.zhuravishkin.springbootjpamultipledatasource.repository.oracle.OneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneService {
    private final OneRepository repository;

    public OneService(OneRepository repository) {
        this.repository = repository;
    }

    public List<OneEntity> getOneEntities() {
        return repository.findAll();
    }
}
