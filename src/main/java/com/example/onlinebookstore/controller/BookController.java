package com.example.onlinebookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/api/books")
	public String apiForGetAllBooks() {
		System.out.println("api called successfully");
		return "Fiction books are here";
	}
}
