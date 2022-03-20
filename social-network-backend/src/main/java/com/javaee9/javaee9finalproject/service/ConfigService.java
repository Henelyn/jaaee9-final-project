package com.javaee9.javaee9finalproject.service;

import com.javaee9.javaee9finalproject.dto.InitialConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConfigService { //we need to find a way to read "social.network.application.name" from app.prop
    private final String applicationName;

    public ConfigService(@Value("${social.network.application.name}")  String applicationName) {
        log.info("application name: [{}]", applicationName);
        this.applicationName = applicationName;
    }

    public InitialConfig getInitialConfig(){ //this method will return initial config
        return new InitialConfig(applicationName); //if someone calls that method it will return applicationName
    }
}
