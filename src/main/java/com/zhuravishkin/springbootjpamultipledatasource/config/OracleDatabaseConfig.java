package com.zhuravishkin.springbootjpamultipledatasource.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {"com.zhuravishkin.springbootjpamultipledatasource.repository.oracle"},
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager")
public class OracleDatabaseConfig {
    @Primary
    @Bean(name = "datasourceOracle")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "oracleEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactory(final EntityManagerFactoryBuilder builder,
                                                                             final @Qualifier("datasourceOracle") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.zhuravishkin.springbootjpamultipledatasource.model.oracle")
                .persistenceUnit("oracleDb")
//                .properties(singletonMap("hibernate.hbm2ddl.auto", "create-drop"))
                .build();
    }

    @Primary
    @Bean(name = "oracleTransactionManager")
    public PlatformTransactionManager oracleTransactionManager(@Qualifier("oracleEntityManagerFactory") EntityManagerFactory oracleEntityManagerFactory) {
        return new JpaTransactionManager(oracleEntityManagerFactory);
    }
}
