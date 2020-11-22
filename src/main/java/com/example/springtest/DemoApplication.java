package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
@RestController
class HelloController {

	@GetMapping("/hello")
	String home() {
		return "Hello World!";
	}

	@GetMapping("/genres")
	public ResponseEntity<Set<String>> findAllGenres() {
		return new ResponseEntity<>(new TreeSet<>(Arrays.asList("Technology", "Science", "History", "Fantasy", "Biography", "Horror", "Romance")), HttpStatus.OK);
	}
}
