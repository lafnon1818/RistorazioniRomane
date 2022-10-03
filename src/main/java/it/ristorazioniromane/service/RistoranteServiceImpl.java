package it.ristorazioniromane.service;

import it.ristorazioniromane.models.Ristorante;
import it.ristorazioniromane.repository.RistoranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RistoranteServiceImpl implements RistoranteService {

    @Autowired
    private RistoranteRepository ristoranteRepository;


    @Override
    public List<Ristorante> getRistoranti() {
        return ristoranteRepository.findAll();
    }
}
