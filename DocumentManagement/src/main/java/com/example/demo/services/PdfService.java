package com.example.demo.services;

public class PdfService implements DocumentCotrolIerInterface {

	@Override
	public void readDataFromDb() {
		// TODO Auto-generated method stub
		System.out.println("read data from db");
	}

	@Override
	public void processData() {
		System.out.println("processing pdf ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String print() {
		
		System.out.println("pdf is printing");
		// TODO Auto-generated method stub
		return "pdf printed";
	}

}
