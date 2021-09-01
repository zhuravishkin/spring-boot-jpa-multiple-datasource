package com.zhuravishkin.springbootjpamultipledatasource.repository.postgres;

import com.zhuravishkin.springbootjpamultipledatasource.model.postgres.PostgresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresRepository extends JpaRepository<PostgresEntity, Long> {
}
