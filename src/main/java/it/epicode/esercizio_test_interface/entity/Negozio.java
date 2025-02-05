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
@Table(name = "negozi")
public class Negozio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Long id;
    // nome: string  indirizzo: string  telefono: string email: string: videogiochi: list console: list
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String indirizzo;
    @Column(length = 100)
    private String telefono;
    @Column(length = 100)
    private String email;
    @ManyToMany
    private List<Videogioco> videogiochi;
    @ManyToMany
    private List<Console> console;

}
