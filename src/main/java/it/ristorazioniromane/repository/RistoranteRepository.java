package it.ristorazioniromane.repository;

import it.ristorazioniromane.models.Ristorante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RistoranteRepository extends JpaRepository<Ristorante, Integer> {
}
