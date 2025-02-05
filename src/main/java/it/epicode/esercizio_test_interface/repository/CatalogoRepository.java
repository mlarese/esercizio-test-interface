package it.epicode.esercizio_test_interface.repository;


import it.epicode.esercizio_test_interface.entity.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {


}
