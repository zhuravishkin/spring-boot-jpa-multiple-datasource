package com.zhuravishkin.springbootjpamultipledatasource.repository.oracle;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneRepository extends JpaRepository<OneEntity, Long> {
}
