package it.ristorazioniromane.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ristoranti")
@Data
@NoArgsConstructor
public class Ristorante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,insertable = false)
    private int id;
    @Column(unique = true,nullable = false)
    private String nome;
    @Column(unique = true,nullable = false)
    private String indirizzo;
    @Column
    private String particolarita;
    @Column(name = "consigli_vari")
    private String consigliVari;
    @Column(name = "provato_non_provato")
    private String provatoNonProvato;

}
