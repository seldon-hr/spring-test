package com.microservicetest.microservice.data;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.microservicetest.microservice.utils.LocalDateAdapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private Long id;
    private String key;
    private String type;
    private String name;
    private String username;
    private String fatherLastname;
    private String motherLastname;
    private String password;
    private UserType userType; //tipo de dato como enump
    public enum UserType { //Creando nuestro tipo de dato, con un enum. Conjunto de constantes.
        ADMIN, AGENTE, PROMOTOR
    }
    @SerializedName("startSession")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate startSession;
    @SerializedName("endSession")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate endSession;

    //To print eache propertie whiler are debbugging
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", fatherLastname='" + fatherLastname + '\'' +
                ", motherLastname='" + motherLastname + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", startSession=" + startSession +
                ", endSession=" + endSession +
                ", onlineTime=" + onlineTime +
                ", status=" + status +
                '}';
    }

    @SerializedName("onlineTime")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate onlineTime;
    private Status status;

    public enum Status {
        ONLINE, OFFLINE
    }

    // getters y setters: métodos que van a acceder a las variables, solo estos. Encapsulamiento


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFatherLastname() {
        return fatherLastname;
    }

    public void setFatherLastname(String fatherLastname) {
        this.fatherLastname = fatherLastname;
    }

    public String getMotherLastname() {
        return motherLastname;
    }

    public void setMotherLastname(String motherLastname) {
        this.motherLastname = motherLastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LocalDate getStartSession() {
        return startSession;
    }

    public void setStartSession(LocalDate startSession) {
        this.startSession = startSession;
    }

    public LocalDate getEndSession() {
        return endSession;
    }

    public void setEndSession(LocalDate endSession) {
        this.endSession = endSession;
    }

    public LocalDate getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(LocalDate onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
