package com.employee.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Properties Configuration bean maps all the properties presents in
 * application.properties.
 * </p>
 * 
 * @author mohit arya
 * @version 1.0
 *
 */
@Component
@PropertySource(value = "file:///home/wittybrains/Desktop/application.properties", ignoreResourceNotFound = false)
public class PropConfig implements InitializingBean {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * server port
	 */
	@Value("${port}")
	private Long serverPort;

	/**
	 * database driver
	 */
	@Value("${databasedriver}")
	private String databaseDriver;

	/**
	 * database url
	 */
	@Value("${databaseurl}")
	private String datasourceUrl;

	/**
	 * database username
	 */
	@Value("${databaseusername}")
	private String datasourceUsername;

	/**
	 * database password
	 */
	@Value("${databasepassword}")
	private String datasourcePassword;

	/**
	 * The database vendor.
	 */
	@Value("${database.vendor}")
	private Database vendor;

	/**
	 * hibernate dialect properties
	 */
	@Value("${hibernatedialect}")
	private String hibernateDialect;

	/**
	 * The boolean property to whether generate DDL or not.
	 */
	@Value("${database.generateDdl}")
	private boolean generateDdl;

	/**
	 * hibernate ddl auto property
	 */
	@Value("${hibernateddl-auto}")
	private String hibernateDdlAuto;

	/**
	 * jpa show sql property
	 */
	@Value("${jpashow-sql}")
	private Boolean jpaShowSql;

	/**
	 * jackson serialization property
	 */
	@Value("${spring.jackson.serialization.fail-on-empty-beans}")
	private Boolean jacksonSerialization;

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	public PropConfig() {
		logger.info("PropConfog initialized");
	}

	/**
	 * @return the serverPort
	 */
	public Long getServerPort() {
		return serverPort;
	}

	/**
	 * @param serverPort
	 *            the serverPort to set
	 */
	public void setServerPort(Long serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * @return the datasourceUrl
	 */
	public String getDatasourceUrl() {
		return datasourceUrl;
	}

	/**
	 * @param datasourceUrl
	 *            the datasourceUrl to set
	 */
	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}

	/**
	 * @return the datasourceUsername
	 */
	public String getDatasourceUsername() {
		return datasourceUsername;
	}

	/**
	 * @param datasourceUsername
	 *            the datasourceUsername to set
	 */
	public void setDatasourceUsername(String datasourceUsername) {
		this.datasourceUsername = datasourceUsername;
	}

	/**
	 * @return the datasourcePassword
	 */
	public String getDatasourcePassword() {
		return datasourcePassword;
	}

	/**
	 * @param datasourcePassword
	 *            the datasourcePassword to set
	 */
	public void setDatasourcePassword(String datasourcePassword) {
		this.datasourcePassword = datasourcePassword;
	}

	/**
	 * @return the hibernateDialect
	 */
	public String getHibernateDialect() {
		return hibernateDialect;
	}

	/**
	 * @param hibernateDialect
	 *            the hibernateDialect to set
	 */
	public void setHibernateDialect(String hibernateDialect) {
		this.hibernateDialect = hibernateDialect;
	}

	/**
	 * @return the hibernateDdlAuto
	 */
	public String getHibernateDdlAuto() {
		return hibernateDdlAuto;
	}

	/**
	 * @param hibernateDdlAuto
	 *            the hibernateDdlAuto to set
	 */
	public void setHibernateDdlAuto(String hibernateDdlAuto) {
		this.hibernateDdlAuto = hibernateDdlAuto;
	}

	/**
	 * @return the logger
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * @return the databaseDriver
	 */
	public String getDatabaseDriver() {
		return databaseDriver;
	}

	/**
	 * @param databaseDriver
	 *            the databaseDriver to set
	 */
	public void setDatabaseDriver(String databaseDriver) {
		this.databaseDriver = databaseDriver;
	}

	/**
	 * @return the jpaShowSql
	 */
	public Boolean getJpaShowSql() {
		return jpaShowSql;
	}

	/**
	 * @param jpaShowSql
	 *            the jpaShowSql to set
	 */
	public void setJpaShowSql(Boolean jpaShowSql) {
		this.jpaShowSql = jpaShowSql;
	}

	/**
	 * @return the jacksonSerialization
	 */
	public Boolean getJacksonSerialization() {
		return jacksonSerialization;
	}

	/**
	 * @param jacksonSerialization
	 *            the jacksonSerialization to set
	 */
	public void setJacksonSerialization(Boolean jacksonSerialization) {
		this.jacksonSerialization = jacksonSerialization;
	}

	/**
	 * @return the generateDdl
	 */
	public boolean isGenerateDdl() {
		return generateDdl;
	}

	/**
	 * @param generateDdl
	 *            the generateDdl to set
	 */
	public void setGenerateDdl(boolean generateDdl) {
		this.generateDdl = generateDdl;
	}

	/**
	 * @return the vendor
	 */
	public Database getVendor() {
		return vendor;
	}

	/**
	 * @param vendor
	 *            the vendor to set
	 */
	public void setVendor(Database vendor) {
		this.vendor = vendor;
	}

}
