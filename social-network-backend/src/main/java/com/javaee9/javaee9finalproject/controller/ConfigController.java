package com.javaee9.javaee9finalproject.controller;

import com.javaee9.javaee9finalproject.dto.InitialConfig;
import com.javaee9.javaee9finalproject.service.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //provides us just a date in json format. InitialConfig in json. Just controller will provides us HTML page
@Slf4j  //for logs
@RequestMapping("/config") //generic endpoint to that controller
@CrossOrigin("*")
public class ConfigController {
    private final ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping()
    public InitialConfig provideInitialConfig() { //returns InitialConfig
        log.info("provides initial config was called");
        return configService.getInitialConfig();
    }
}
