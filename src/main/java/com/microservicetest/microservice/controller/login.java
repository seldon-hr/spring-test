package com.microservicetest.microservice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.microservicetest.microservice.data.User;
import com.microservicetest.microservice.utils.LocalDateAdapter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;


@CrossOrigin
@RestController
@RequestMapping("/login")
public class login {

    //Testing with modelandview data
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public ModelAndView test(@RequestParam("user") String nickname, @RequestParam("pass") String pass) throws FileNotFoundException{
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("home");
//        List<User> listaUsuarios = readJSON();
//        for (User user : listaUsuarios){
//            if(user.getUsername().equals(nickname)){
//                if (user.getPassword().equals(pass)){
//                    return modelAndView;
//                }
//            }
//        }
//        return new ModelAndView("http://localhost:8080/");
//    }


    //Redirrecionador al comprobar las credenciales.
    @GetMapping("/session")
    public RedirectView test(@RequestParam("user") String nickname, @RequestParam("pass") String pass) throws FileNotFoundException{
        List<User> listaUsuarios = readJSON();
        for (User user : listaUsuarios){
            if(user.getUsername().equals(nickname)){
                if (user.getPassword().equals(pass)){
                    RedirectView redict = new RedirectView();
                    redict.setUrl("/home");
                    return redict;
                }
            }
        }
        return new RedirectView("http://localhost:8080/");
    }


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

}

