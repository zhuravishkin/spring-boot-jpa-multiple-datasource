package com.zhuravishkin.springbootjpamultipledatasource;

import com.zhuravishkin.springbootjpamultipledatasource.model.oracle.OracleEntity;
import com.zhuravishkin.springbootjpamultipledatasource.model.postgres.PostgresEntity;
import com.zhuravishkin.springbootjpamultipledatasource.repository.oracle.OracleRepository;
import com.zhuravishkin.springbootjpamultipledatasource.repository.postgres.PostgresRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

@DataJpaTest
class SpringBootJpaMultipleDatasourceApplicationTests {
    @Autowired
    private OracleRepository oracleRepository;

    @Autowired
    private PostgresRepository postgresRepository;

    @SneakyThrows
    @Test
    void contextLoads() {
        oracleRepository.save(OracleEntity.builder()
                .phoneNumber("9306661000")
                .age(31)
                .email("john@gmail.com")
                .action("added")
                .build());
        System.out.println(oracleRepository.findAll());
        postgresRepository.save(PostgresEntity.builder()
                .phoneNumber("9306661000")
                .age(31)
                .email("john@gmail.com")
                .action("added")
                .dateTime(LocalDateTime.now())
                .build());
        System.out.println(postgresRepository.findAll());
    }

}
