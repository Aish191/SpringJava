package com.example.demo;

import com.example.demo.services.DocumentInterface;

public class ExcelService implements DocumentInterface
{

	@Override
	public void readDataFromDb() {
		// TODO Auto-generated method stub
		System.out.println("daat is read");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("data processed");
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return " excel printed";
	}

	
}
