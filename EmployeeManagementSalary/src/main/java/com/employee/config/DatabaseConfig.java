package com.employee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Configuration class used to do the all database configuration.
 * 
 * @author mohit arya
 *
 */
@Configuration
public class DatabaseConfig {

	protected PropConfig propConfig;

	@Autowired
	public DatabaseConfig(PropConfig propConfig) {
		this.propConfig = propConfig;
	}

	/**
	 * Instantiate the Bean of DataSource to getting a connection.
	 * 
	 * @return DataSource returns the DriverManagerDataSource object
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(propConfig.getDatabaseDriver());
		dataSource.setUrl(propConfig.getDatasourceUrl());
		dataSource.setUsername(propConfig.getDatasourceUsername());
		dataSource.setPassword(propConfig.getDatasourcePassword());

		return dataSource;
	}

	/**
	 * Instantiate the Bean of ValidationFactory.
	 * 
	 * @return LocalValidatorFactoryBean returns the LocalValidatorBeanFactory
	 *         object
	 */
	@Bean
	public LocalValidatorFactoryBean validator() {
		final LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();

		return validator;
	}

	/**
	 * Instantiate the Entity manager factory bean.
	 * 
	 * @param dataSource
	 *            The DataSource object. Currently a DriverManagerDataSource object
	 * @param jpaVendorAdapter
	 *            Extra information for vendor's adapter
	 * @return LocalContainerEntityManagerFactoryBean The entity manager factory
	 *         bean
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
			JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource);
		lef.setJpaVendorAdapter(jpaVendorAdapter);
		lef.setPackagesToScan("com.employee.model");
		// this will configure spring.jpa.hibernate.ddl-auto
		lef.getJpaPropertyMap().put("spring.jpa.hibernate.ddl-auto", "update");
		// this will configure spring.jackson.serialization.fail-on-empty-beans
		lef.getJpaPropertyMap().put("spring.jackson.serialization.fail-on-empty-beans", "false");
		// this will set spring.jpa.properties.hibernate.dialect
		lef.getJpaPropertyMap().put("spring.jpa.properties.hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		return lef;
	}

	/**
	 * Instantiate the persistence handler to be used in whole application. For now
	 * it is a Hibernate adapter
	 * 
	 * @return JpaVendorAdapter the persistence adapter (Hibernate for now)
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setShowSql(propConfig.getJpaShowSql());
		hibernateJpaVendorAdapter.setGenerateDdl(propConfig.isGenerateDdl());
		hibernateJpaVendorAdapter.setDatabase(propConfig.getVendor());

		return hibernateJpaVendorAdapter;
	}

	/**
	 * Instantiate the JPATransaction Manager to implements the transaction
	 * template.
	 * 
	 * @return PlatformTransactionManager new instance of JpaTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager();
	}

	@Bean
	public EmbeddedServletContainerCustomizer configure() {
		return (container -> {
			container.setPort(propConfig.getServerPort().intValue());
		});

	}
}
