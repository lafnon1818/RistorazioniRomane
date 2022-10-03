package it.ristorazioniromane.controller;

import it.ristorazioniromane.models.Ristorante;
import it.ristorazioniromane.service.RistoranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RistoranteController {

    @Autowired
    private RistoranteService ristoranteService;

    @GetMapping(value = "/getRistoranti")
    public List<Ristorante> getRistoranti(){
        return ristoranteService.getRistoranti();
    }



}
