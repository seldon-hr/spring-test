package com.microservicetest.microservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.microservicetest.microservice.data.User;
import com.microservicetest.microservice.utils.LocalDateAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MicroServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceApplication.class, args);
	}


	//Lectura de un Json.
	private void readJSON() throws FileNotFoundException {
		String jsonString = "";

		File jsonFile = new File("src/main/resources/array.json");
		Scanner scanner = new Scanner(jsonFile);

		while (scanner.hasNextLine()) {
			jsonString += scanner.nextLine();
		}
		//Uso de la librería de Gson para transformar en tipo JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDateAdapter.class, new LocalDateAdapter()).create();
		Type listType = new TypeToken<List<User>>() {}.getType();

		List<User> users = gson.fromJson(jsonString, listType);

		users.forEach(p -> {
			System.out.println(p);
			System.out.println("#######");
		});

	}

	@Override
	public void run(String... args) throws Exception {
		readJSON();
	}
}


