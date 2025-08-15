package com.example.Examen1Back2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Examen1Back2Application {

	public static void main(String[] args) {
		SpringApplication.run(Examen1Back2Application.class, args);
	}

package com.example.Examen1Back2.modelos;

	public enum TipoUsuario {
		ADMIN,
		DOCENTE,
		ESTUDIANTE
	}

}
