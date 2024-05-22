package com.joel.desafioalura;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.joel.desafioalura.principal.Principal;

@SpringBootApplication
public class DesafioAluraApplication {

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
