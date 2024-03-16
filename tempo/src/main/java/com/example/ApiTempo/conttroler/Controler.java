package com.example.ApiTempo.conttroler;

import com.example.ApiTempo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    Service service = new Service();

    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }
}
