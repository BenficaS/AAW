package com.example.ApiTempo.RestAplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.example"} )
	public class TempoApllication {
	public static void main(String[] args) {
		SpringApplication.run(TempoApllication.class,args);
	}
}
