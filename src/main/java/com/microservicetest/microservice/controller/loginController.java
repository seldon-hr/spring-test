package com.microservicetest.microservice.controller;

public class loginController {


    //Lectura de un Json.
    private void readJSON() throws FileNotFoundException {
        String jsonString = "";

        File jsonFile = new File("src/main/resources/ejemplo.json");
        Scanner scanner = new Scanner(jsonFile);

        while (scanner.hasNextLine()) {
            jsonString += scanner.nextLine();
        }

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Persona>>() {}.getType();

        List<Persona> personas = gson.fromJson(jsonString, listType);

        personas.forEach(p -> {
            System.out.println(p.getNombre());
            System.out.println(p.getApellido());
            System.out.println(p.getEdad());
            System.out.println("#######");
        });

    }
}
