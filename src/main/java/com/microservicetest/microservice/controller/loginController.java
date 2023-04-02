package com.microservicetest.microservice.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.microservicetest.microservice.data.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class loginController {


    //Lectura de un Json.
    private void readJSON() throws FileNotFoundException {
        String jsonString = "";

        File jsonFile = new File("src/main/resources/array.json");
        Scanner scanner = new Scanner(jsonFile);

        while (scanner.hasNextLine()) {
            jsonString += scanner.nextLine();
        }

        Gson gson = new Gson();
        Type listType = new TypeToken<List<User>>() {}.getType();

        List<User> users = gson.fromJson(jsonString, listType);

        users.forEach(p -> {
            System.out.println(p.getUsername());
            System.out.println(p.getUserType());

            System.out.println("#######");
        });

    }
}
