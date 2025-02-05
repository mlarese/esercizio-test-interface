package it.epicode.esercizio_test_interface.service;

import it.epicode.esercizio_test_interface.entity.Categoria;
import it.epicode.esercizio_test_interface.repository.CategoriaRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria categoria) {
//        if(categoriaRepository.existsByDescrizione(categoria.getDescrizione())) {
//            throw new EntityExistsException("Categoria with description " + categoria.getDescrizione() + " already exists");
//        }



        return categoriaRepository.save(categoria);
    }

    // se l'emento non viene trovato va lanciata un eccezione
    public Categoria findById(Long id) {
        if(!categoriaRepository.existsById(id)) {
            throw new EntityNotFoundException("Categoria not found with id " + id);
        }
        return categoriaRepository.findById(id).get();
    }

}
