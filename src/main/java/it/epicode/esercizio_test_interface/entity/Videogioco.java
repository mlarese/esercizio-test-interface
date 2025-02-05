package it.epicode.esercizio_test_interface.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Videogioco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
//  titolo: string prezzo: double: categoria: categoria

    private String titolo;
    private double prezzo;
    @ManyToMany
    private List<Categoria> categoria;

}
