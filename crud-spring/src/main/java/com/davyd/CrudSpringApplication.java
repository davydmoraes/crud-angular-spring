package com.davyd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.davyd.models.Course;
import com.davyd.repositories.CourseRepository;

@EntityScan("com.davyd.*")
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.davyd.*" })
@EnableJpaRepositories(basePackages = {
        "com.davyd.repositories" }/* , entityManagerFactoryRef = "courseRepository" */)
@SpringBootApplication(scanBasePackages = "com.davyd.*")
public class CrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDataBase(CourseRepository courseRepository) {
        return args -> {
            courseRepository.deleteAll();
            Course cursoTeste = new Course();
            // cursoTeste.setId(null);
            cursoTeste.setName("Angular");
            cursoTeste.setCategory("front-end");

            courseRepository.save(cursoTeste);
        };
    }

}
