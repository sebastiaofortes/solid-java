package com.sebastiaofortes.solidjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebastiaofortes.solidjava.violation.LiskovSubstitution;

@SpringBootApplication
public class SolidJavaApplication {

	public static void main(String[] args) {
		LiskovSubstitution l = new LiskovSubstitution();
		SpringApplication.run(SolidJavaApplication.class, args);
	}

}
