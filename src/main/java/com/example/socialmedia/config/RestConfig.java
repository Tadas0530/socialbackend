package com.example.socialmedia.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    private EntityManager entityManager;

    @Autowired
    public RestConfig(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
}
