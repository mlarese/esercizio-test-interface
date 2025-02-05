package it.epicode.esercizio_test_interface.repository;


import it.epicode.esercizio_test_interface.entity.Console;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsoleRepository extends JpaRepository<Console, Long> {
}
