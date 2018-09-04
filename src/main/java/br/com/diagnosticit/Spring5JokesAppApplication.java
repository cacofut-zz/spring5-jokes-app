package br.com.diagnosticit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan(basePackages = {"br.com.diagnosticit"})
@ImportResource("classpath:chuck-config.xml")
public class Spring5JokesAppApplication {

	public static void main(String[] args) {
            SpringApplication.run(Spring5JokesAppApplication.class, args);
	}
}
