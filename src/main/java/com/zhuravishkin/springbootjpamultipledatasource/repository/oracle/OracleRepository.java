package com.zhuravishkin.springbootjpamultipledatasource.repository.oracle;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OracleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleRepository extends JpaRepository<OracleEntity, Long> {
    @Procedure(value = "neo.insert_user_from_schema")
    void insertUser(
            @Param("phone_number") String phoneNumber,
            @Param("age") Integer age,
            @Param("email") String email,
            @Param("action") String action);
}
