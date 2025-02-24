package com.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.baeldung.boot.daos.impl.ExtendedRepositoryImpl;

@SpringBootApplication
@PropertySource("classpath:secret.properties")
@EnableJpaRepositories(repositoryBaseClass = ExtendedRepositoryImpl.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
