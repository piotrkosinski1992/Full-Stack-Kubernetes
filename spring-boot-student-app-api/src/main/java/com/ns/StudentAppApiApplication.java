package com.ns;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApiApplication.class, args);
	}

	@Bean
	ApplicationRunner init(StudentMysqlRepository studentMongoRepository) {
		return (ApplicationArguments args) -> dataSetup(studentMongoRepository);
	}

	private void dataSetup(StudentMysqlRepository studentMongoRepository) {
		System.out.println("Adding student");
		Student student = new Student("Niraj","Sonawane");
		studentMongoRepository.save(student);
	}
}
