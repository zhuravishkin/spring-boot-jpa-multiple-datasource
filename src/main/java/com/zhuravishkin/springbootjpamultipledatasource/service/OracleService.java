package com.zhuravishkin.springbootjpamultipledatasource.service;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OracleEntity;
import com.zhuravishkin.springbootjpamultipledatasource.repository.oracle.OracleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OracleService {
    private final OracleRepository repository;

    public OracleService(OracleRepository repository) {
        this.repository = repository;
    }

    public List<OracleEntity> getOracleEntities() {
        return repository.findAll();
    }

    public void insertUser(String phoneNumber, Integer age, String email, String action) {
        repository.insertUser(phoneNumber, age, email, action);
    }

    public OracleEntity saveOracleEntity(OracleEntity oracleEntity) {
        return repository.save(oracleEntity);
    }

    public List<OracleEntity> saveOracleEntities(List<OracleEntity> oracleEntities) {
        return repository.saveAll(oracleEntities);
    }

    public OracleEntity getOracleEntityById(long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteOracleEntity(long id) {
        repository.deleteById(id);
        return "OracleEntity removed: " + id;
    }
}
