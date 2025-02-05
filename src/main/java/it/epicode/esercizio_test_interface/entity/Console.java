package it.epicode.esercizio_test_interface.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "consoles")
public class Console implements VoceCatalogo{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // descrizione: string marca: string modello: string
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String marca;
    @Column(length = 100)
    private String modello;

    @Override
    public String descrizione() {
        return  nome + ", " + marca + " " + modello;
    }
}
