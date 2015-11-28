package com.azan.app.config.web;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

@EnableWebMvc
@ComponentScan(basePackages={"com.azan.app.common", "com.azan.app.controller", "com.azan.app.core.service", "com.azan.app.core.service.impl", 
				"com.azan.app.exception", "com.azan.app.model", "com.azan.app.persistance.entity", "com.azan.app.persistance.repo", "com.azan.app.util"})
@Configuration
@Configurable
@Import({ Log4jConfig.class ,DataBaseConfig.class })
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	
	@Bean
	public VelocityConfigurer getVelocityConfig() {
		VelocityConfigurer velConfig = new VelocityConfigurer();
		velConfig.setResourceLoaderPath("/WEB-INF/html/");
		return velConfig;
	}
	
	@Bean
	public VelocityViewResolver getVelocityViewResolver() {
		VelocityViewResolver resolver = new VelocityViewResolver();
		resolver.setCache(true);
		resolver.setExposeSpringMacroHelpers(true);
		resolver.setPrefix("");
		resolver.setSuffix(".html");
		return resolver;
	}
	
	@Bean @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public CommonsMultipartResolver getMultipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(10000);
        return resolver;
    }
}
