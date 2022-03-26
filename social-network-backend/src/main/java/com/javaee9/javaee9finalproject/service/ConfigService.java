package com.javaee9.javaee9finalproject.service;

import com.javaee9.javaee9finalproject.dto.InitialConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
//made the class after dto InitialConfig class. So they will connect with each other?
@Service //to make it a service
@Slf4j   // for login info
//This class is going to read information from application.properties: "social.network.application.name"
public class ConfigService {
    private final String applicationName; //We need constructor parameters -> follows
    //@Value from spring = ("${social.network.application.name}") = Fakebook from application.properties
    public ConfigService(@Value("${social.network.application.name}")  String applicationName) { //constructor
        log.info("application name: [{}]", applicationName); //just for a log information
        this.applicationName = applicationName; //Will return the application name
    }

    public InitialConfig getInitialConfig(){ //this method will return InitialConfig object with applicationName?
        return new InitialConfig(applicationName); //if someone calls that method it will return applicationName
    }
}
