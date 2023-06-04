package com.example.filter.headerfilterexample.config;

import com.example.filter.headerfilterexample.config.filters.HeaderContainer.HeaderContainer;
import com.example.filter.headerfilterexample.config.filters.HeaderFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration

public class BeansConfig {

    private final HeaderContainer headerContainer;

    public BeansConfig(HeaderContainer headerContainer) {
        this.headerContainer = headerContainer;
    }

    /**
     *
     *
     * @return
     *
     */
    //registro de filtro para ser usado en spring boot
    @Bean
    public FilterRegistrationBean<HeaderFilter> headerFilterRegistration() {
        FilterRegistrationBean<HeaderFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new HeaderFilter(headerContainer));
        // filtro que permite configurar si se usara en todos los endpoints o solo en uno especifico
        registration.addUrlPatterns("/*");

        return registration;
    }
}
