package it.epicode.esercizio_test_interface.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Catalogo")

public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;

    // voci_di_catalogo: list
    @ManyToMany
    private List<VoceCatalogo> voci_di_catalogo;

}
