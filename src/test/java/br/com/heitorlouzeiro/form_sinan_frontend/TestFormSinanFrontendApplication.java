package br.com.heitorlouzeiro.form_sinan_frontend;

import org.springframework.boot.SpringApplication;

public class TestFormSinanFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.from(FormSinanFrontendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
