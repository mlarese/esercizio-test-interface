package it.epicode.esercizio_test_interface.repository;

import it.epicode.esercizio_test_interface.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {
    Categoria findByDescrizione(String descrizione);
    boolean existsByDescrizione(String descrizione);
}
