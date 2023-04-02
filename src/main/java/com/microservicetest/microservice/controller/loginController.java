package com.microservicetest.microservice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.microservicetest.microservice.data.User;
import com.microservicetest.microservice.utils.LocalDateAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/login")
public class loginController {


    //Lectura de un Json.

    private List<User> readJSON() throws FileNotFoundException {
        String jsonString = "";

        File jsonFile = new File("src/main/resources/array.json");
        Scanner scanner = new Scanner(jsonFile);

        while (scanner.hasNextLine()) {
            jsonString += scanner.nextLine();
        }
        //Uso de la librería de Gson para transformar en tipo JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDateAdapter.class, new LocalDateAdapter()).create();
        Type listType = new TypeToken<List<User>>() {}.getType();

        return gson.fromJson(jsonString, listType);


    }

    @GetMapping("/example")
    public User example() throws FileNotFoundException {
        List<User> listaUsuarios = readJSON();
        User usuario = listaUsuarios.get(0);
        return usuario;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Say Hello";
    }
}
