package com.javaee9.javaee9finalproject.controller;

import com.javaee9.javaee9finalproject.dto.InitialConfig;
import com.javaee9.javaee9finalproject.service.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //provides us a date in json format. We need InitialConfig as json and provide it to frontend. (Just controller will provide us HTML page)
@Slf4j  //for logs
@RequestMapping("/config") //generic endpoint to that controller
@CrossOrigin("*")  //Mis see on?
public class ConfigController { //Selle controlleri eesmärk on?
    private final ConfigService configService; //private final...kuidas sellele siis ligi saadaks?

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping()
    public InitialConfig provideInitialConfig() { //returns InitialConfig
        log.info("provides initial config was called");
        return configService.getInitialConfig();
    }
}
