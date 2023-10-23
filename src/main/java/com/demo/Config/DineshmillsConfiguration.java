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
    basePackages = "com.demo.Repository.DinvHeaderRepositoryH", 
    entityManagerFactoryRef = "dineshmillsEntityManager", 
    transactionManagerRef = "dineshmillsTransactionManager"
)

public class DineshmillsConfiguration {
	
	@Autowired
    private Environment env;
	
	@Primary
    @Bean(name="dineshmillsDataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dineshmillsDataSource() {
        return DataSourceBuilder.create().build();
    }
	
	
	@Primary
	@Bean(name="dineshmillsEntityManager")
    public LocalContainerEntityManagerFactoryBean dineshmillsEntityManager() {
        
		LocalContainerEntityManagerFactoryBean em  = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dineshmillsDataSource());
        em.setPackagesToScan(new String[] { "com.demo.Model.DInvReqHeaderH" });

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

	
	@Primary
	@Bean(name="dineshmillsTransactionManager")
    public PlatformTransactionManager dineshmillsTransactionManager() {
        
		JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(dineshmillsEntityManager().getObject());
        
        return transactionManager;
	}
	
	
}
