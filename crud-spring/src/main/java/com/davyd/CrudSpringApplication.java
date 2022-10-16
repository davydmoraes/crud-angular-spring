package com.davyd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.davyd.models.Course;
import com.davyd.repositories.CourseRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class CrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDataBase(CourseRepository courseRepository) {
        return args -> {
            courseRepository.deleteAll();
            Course cursoTeste = new Course();
            cursoTeste.setName("Angular");
            cursoTeste.setCategory("front-end");

            courseRepository.save(cursoTeste);
        };
    }

}
