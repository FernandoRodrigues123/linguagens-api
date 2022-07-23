package br.com.alura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository linguagemRepository;

    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagems() {

        List<Linguagem> lista = linguagemRepository.findAll();

        return lista;
    }

    @PostMapping(value = "/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem l) {
        return linguagemRepository.save(l);

    }
}
