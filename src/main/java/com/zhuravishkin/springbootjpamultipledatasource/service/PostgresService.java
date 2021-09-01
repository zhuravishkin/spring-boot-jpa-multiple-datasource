package com.zhuravishkin.springbootjpamultipledatasource.service;

import com.zhuravishkin.springbootjpamultipledatasource.model.postgres.PostgresEntity;
import com.zhuravishkin.springbootjpamultipledatasource.repository.postgres.PostgresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostgresService {
    private final PostgresRepository repository;

    public PostgresService(PostgresRepository repository) {
        this.repository = repository;
    }

    public List<PostgresEntity> getPostgresEntities() {
        return repository.findAll();
    }

    public PostgresEntity savePostgresEntity(PostgresEntity postgresEntity) {
        return repository.save(postgresEntity);
    }

    public List<PostgresEntity> saveOracleEntities(List<PostgresEntity> postgresEntities) {
        return repository.saveAll(postgresEntities);
    }

    public PostgresEntity getPostgresEntityById(long id) {
        return repository.findById(id).orElse(null);
    }

    public String deletePostgresEntity(long id) {
        repository.deleteById(id);
        return "PostgresEntity removed: " + id;
    }
}
