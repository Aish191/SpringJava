package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ExcelService;
import com.example.demo.services.DocumentInterface;
import com.example.demo.services.PdfService;
@RestController
public class DocumentController 
{
	@GetMapping("print /{type}")//we have used equals so that we don't need to modify THE code
	public String  printInvoice(@PathVariable String type)
	{
		DocumentInterface ds = null;
		
		if(type.equals("pdf"))
		{
			ds= new PdfService();
		}
		if (type.equals("excel"))
		{
			ds = new ExcelService();
		}
		
		ds.readDataFromDb();
		ds.processData();
		return ds.print();
	}
	}
		


