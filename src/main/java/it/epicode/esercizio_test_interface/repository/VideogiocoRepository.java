package it.epicode.esercizio_test_interface.repository;


import it.epicode.esercizio_test_interface.entity.Videogioco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogiocoRepository extends JpaRepository<Videogioco, Long> {
    Videogioco findByTitolo(String titolo);
}
