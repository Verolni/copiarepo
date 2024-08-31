package org.riwi.Spring_Workshop_Week_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWorkshopWeek3Application {
	//Metodos a utilizar
	// Students - get - Listas estudiantes
	// Students - get - Hayar un estudiante por ID
	// Students - post - Agregar un estudiante
	// Students - patch - Cambiar el atributo active para deshabilitarlo
	// Class - get - Listar todas las clases
	// Class - get - Hayar clase por ID
	// Class - post - Agregar nueva clase
	// Lessons - post - Agregar leccion
	// Lessons - patch - Deshabilitar alguna leccion
	// Lessons - get - Obtener una leccion en especifico
	public static void main(String[] args) {
		SpringApplication.run(SpringWorkshopWeek3Application.class, args);
	}

}
