package com.microservicetest.microservice.data;

public class User {
    private Long id;
    private String key;
    private String kind;
    private String name;
    private String username;
    private String fatherLastname;
    private String motherLastname;
    private String password;
    private UserType kindUser; //tipo de dato como enump
    public enum UserType { //Creando nuestro tipo de dato, con un enum. Conjunto de constantes.
        ADMIN, AGENTE, PROMOTOR
    }
    private LocalDateTime dataStartSession;
    private LocalDateTime dataEndSession;
    private Duration onlineTime;
    private String status;

    // getters y setters
    
}
