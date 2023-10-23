package com.demo.Config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource({ "classpath:application.properties" })
@EnableJpaRepositories(
    basePackages = "com.demo.Repository.AnkempmsRepository", 
    entityManagerFactoryRef = "sdmlattpayEntityManager", 
    transactionManagerRef = "sdmlattpayTransactionManager"
)

public class SdmlAttPayConfiguration {
	
	@Autowired
    private Environment env;
	
	
	@Bean(name="sdmlattpayDataSource")
    @ConfigurationProperties(prefix="spring.datasource2")
    public DataSource sdmlattpayDataSource() {
        return DataSourceBuilder.create().build();
    }
	
	
    @Bean(name="sdmlattpayEntityManager")
    public LocalContainerEntityManagerFactoryBean sdmlattpayEntityManager() {
        LocalContainerEntityManagerFactoryBean em  = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(sdmlattpayDataSource());
        em.setPackagesToScan(new String[] { "com.demo.Model.Ankempms" });

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    
	@Bean(name="sdmlattpayTransactionManager")
    public PlatformTransactionManager sdmlattpayTransactionManager() {
 
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(sdmlattpayEntityManager().getObject());
        return transactionManager;
    }
	
}
