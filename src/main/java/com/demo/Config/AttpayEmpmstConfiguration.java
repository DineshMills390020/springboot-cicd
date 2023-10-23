package com.demo.Config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
    basePackages = "com.demo.Repository.AttpayEmpmstRepository", 
    entityManagerFactoryRef = "attpayEmpmstEntityManager", 
    transactionManagerRef = "attpayEmpmstTransactionManager"
)

public class AttpayEmpmstConfiguration {
	
	@Autowired
    private Environment env;
	
	@Primary
    @Bean(name="attpayEmpmstDataSource")
    @ConfigurationProperties(prefix="spring.datasource2")
    public DataSource attpayEmpmstDataSource() {
        return DataSourceBuilder.create().build();
    }
	
	
	@Primary
	@Bean(name="attpayEmpmstEntityManager")
    public LocalContainerEntityManagerFactoryBean attpayEmpmstEntityManager() {
        
		LocalContainerEntityManagerFactoryBean em  = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(attpayEmpmstDataSource());
        em.setPackagesToScan(new String[] { "com.demo.Model.AttpayEmpmst" });

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

	
	@Primary
	@Bean(name="attpayEmpmstTransactionManager")
    public PlatformTransactionManager attpayEmpmstTransactionManager() {
        
		JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(attpayEmpmstEntityManager().getObject());
        
        return transactionManager;
	}
	
	
}
