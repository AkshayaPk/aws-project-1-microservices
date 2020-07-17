package com.example.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	
	@Override
    public void run(String...args) throws Exception {
        logger.info("Student id 1 -> {}", repository.findById(1));
    }

}
