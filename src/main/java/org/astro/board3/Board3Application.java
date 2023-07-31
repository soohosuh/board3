package org.astro.board3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"org.astro.board3.**.mappers"})
@SpringBootApplication
public class Board3Application {

	public static void main(String[] args) {
		SpringApplication.run(Board3Application.class, args);
	}

}
