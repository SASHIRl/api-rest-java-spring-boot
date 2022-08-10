package com.sashiri.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    
    //Apenas para fazer uma consulta e ver se a aplicação esta online.
    @GetMapping("/api/status")
    public String check() {
        return "online";
    }
    
}
