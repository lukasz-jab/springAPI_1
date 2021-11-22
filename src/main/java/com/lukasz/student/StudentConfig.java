package com.lukasz.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Agnes = new Student().withName("Agnes").withDob(LocalDate.of(1991, Month.AUGUST, 8)).withEmail("adnes@agnes.pl");
            Student Joe = new Student().withName("Joe").withDob(LocalDate.of(1991, Month.AUGUST, 8)).withEmail("joe@joe.pl");
            repository.saveAll(List.of(Agnes, Joe));
        };
    }
}
