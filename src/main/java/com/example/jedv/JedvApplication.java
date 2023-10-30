package com.example.jedv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.jedv.dao.Conexion.getConnection;

@SpringBootApplication
public class JedvApplication {

	public static void main(String[] args) {
		SpringApplication.run(JedvApplication.class, args);
		//getConnection();
	}

}
