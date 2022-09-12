package com.example.prueba_base.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef= "postgresEntityManagerFactory",transactionManagerRef = "postgresTransactionMananger", basePackages = {
		"com.example.prueba_base.postgres.dao"
})
public class PostgresConfig {
	@Autowired
	private Environment env;
	
	
	@Bean( name = "postgresDataSource")
	public DataSource mysqlDataSource() { 		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(env.getProperty("postgres.datasource.url"));
		datasource.setUsername(env.getProperty("postgres.datasource.username"));
		datasource.setPassword(env.getProperty("postgres.datasource.password"));
		datasource.setDriverClassName(env.getProperty("postgres.datasource.driver-class-name"));
		return datasource;
	}
	
	
	@Bean(name="postgresEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entitymanangerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(mysqlDataSource());
		em.setPackagesToScan("com.example.prueba_base.postgres.models");
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		
		Map<String, Object> properties= new HashMap <>();
		properties.put("hibernate.hbm2ddl.auto",env.getProperty("postgres.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.dialect",env.getProperty("postgres.jpa.database-platform"));
		em.setJpaPropertyMap(properties);
		return em;
	}
	
	
	@Bean(name="postgresTransactionMananger")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entitymanangerFactory().getObject());
		return transactionManager;
	}
}
