package com.microservicetest.microservice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.microservicetest.microservice.data.User;
import com.microservicetest.microservice.utils.LocalDateAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

@CrossOrigin
@RestController
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
    public List<User> example() throws FileNotFoundException {
        List<User> listaUsuarios = readJSON();
        return listaUsuarios;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Say Hello";
    }
}
