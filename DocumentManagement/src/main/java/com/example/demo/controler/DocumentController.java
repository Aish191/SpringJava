package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.DocumentCotrolIerInterface;
import com.example.demo.services.ExcelService;

@RestController
public class DocumentController {
	
	@GetMapping("document")
	 String print()
	{
		DocumentCotrolIerInterface d = new ExcelService();
		d.readDataFromDb();
		d.processData();
		d.add();
		return d.print();
		
	}

}
