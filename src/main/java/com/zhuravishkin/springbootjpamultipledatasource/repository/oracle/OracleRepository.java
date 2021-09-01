package com.zhuravishkin.springbootjpamultipledatasource.repository.oracle;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OracleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleRepository extends JpaRepository<OracleEntity, Long> {
}
