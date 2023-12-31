package com.Tobeto.RentaCar;

import com.Tobeto.RentaCar.service.concretes.BrandManager;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentaCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentaCarApplication.class, args);
	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
