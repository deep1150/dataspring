package com.hibernate.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class StoreApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}


}
