package com.example.prueba_base.config;


import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
@EnableJpaRepositories(entityManagerFactoryRef= "mysqlEntityManagerFactory",transactionManagerRef = "mysqlTransactionMananger", basePackages = {
		"com.example.prueba_base.models.dao"
})
public class MysqlConfig {
	@Autowired
	private Environment env;
	
	@Primary
	@Bean( name = "mysqlDataSource")
	public DataSource mysqlDataSource() { 		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(env.getProperty("mysql.datasource.url"));
		datasource.setUsername(env.getProperty("mysql.datasource.username"));
		datasource.setPassword(env.getProperty("mysql.datasource.password"));
		datasource.setDriverClassName(env.getProperty("mysql.datasource.driver-class-name"));
		return datasource;
	}
	
	@Primary
	@Bean(name="mysqlEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entitymanangerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(mysqlDataSource());
		em.setPackagesToScan("com.example.prueba_base.model");
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		
		Map<String, Object> properties= new HashMap <>();
		properties.put("hibernate.hbm2ddl.auto",env.getProperty("mysql.jpa.hibernate.ddl-auto"));
		properties.put("hibernate.dialect",env.getProperty("mysql.jpa.database-platform"));
		em.setJpaPropertyMap(properties);
		return em;
	}
	
	@Primary
	@Bean(name="mysqlTransactionMananger")
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entitymanangerFactory().getObject());
		return transactionManager;
	}
	

}
