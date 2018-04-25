package com.employee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * BootStrap of all initially required configuration beans.
 * </p>
 * 
 * @author Mohit arya
 * @since 1.0
 */
@Configuration
public class InitialBeanConfig {

	@Autowired
	private PropConfig propConfig;
}
