package com.example.demo.services;

public class ExcelService implements DocumentCotrolIerInterface  {

	@Override
	public void readDataFromDb() {
		// TODO Auto-generated method stub
		System.out.println("read data from db");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("process data from excel");
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		System.out.println("print excel");
		return "excel printed";
	}
	

}
