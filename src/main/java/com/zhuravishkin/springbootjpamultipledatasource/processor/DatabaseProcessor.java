package com.zhuravishkin.springbootjpamultipledatasource.processor;

import com.zhuravishkin.springbootjpamultipledatasource.service.OracleService;
import com.zhuravishkin.springbootjpamultipledatasource.service.PostgresService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@EnableScheduling
@Service
public class DatabaseProcessor {
    public final OracleService oracleService;
    public final PostgresService postgresService;

    public DatabaseProcessor(OracleService oracleService, PostgresService postgresService) {
        this.oracleService = oracleService;
        this.postgresService = postgresService;
    }

    @Scheduled(initialDelay = 1_000, fixedDelay = 60_000)
    public void get() {
        oracleService.insertUser("79306661008", 28, "trinity@gmail.com", "create");
        oracleService.getOracleEntities().forEach(System.out::println);
        postgresService.getPostgresEntities().forEach(System.out::println);
    }
}
