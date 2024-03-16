package com.example.ApiTempo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
    public String preverTempo(){
        String dadosMeteorologicos = "";
        String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=f07dc4b4262342783b6cceb87385b38f";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dadosMeteorologicos = responseEntity.getBody();
        }
        else {
            dadosMeteorologicos = "falha ao obter dados meteorologicos." +responseEntity.getStatusCode();
        }
        return dadosMeteorologicos;
    }
}
