package it.epicode.esercizio_test_interface.repository;


import it.epicode.esercizio_test_interface.entity.Negozio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NegozioRepository extends JpaRepository<Negozio, Long> {
}
