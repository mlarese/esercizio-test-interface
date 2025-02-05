package it.epicode.esercizio_test_interface.runners;

import com.github.javafaker.Faker;
import it.epicode.esercizio_test_interface.entity.Categoria;
import it.epicode.esercizio_test_interface.service.CategoriaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DbRunner implements CommandLineRunner {
    private final CategoriaService categoriaService;
    private final Faker faker;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 25; i++) {
            Categoria categoria = new Categoria();
            categoria.setDescrizione(faker.book().genre());

            categoriaService.save(categoria);
        }

        List<Categoria> categorie = categoriaService.findAll();
        for(Categoria c: categorie) {
            log.info("Categoria" + c.getDescrizione());
        }
    }
}
