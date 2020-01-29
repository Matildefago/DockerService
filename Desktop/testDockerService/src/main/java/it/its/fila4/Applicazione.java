package it.its.fila4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
@Getter
@Setter
public class Applicazione {

	public static void main(String[] args) {
		SpringApplication.run(Applicazione.class, args);
	}

}
 
