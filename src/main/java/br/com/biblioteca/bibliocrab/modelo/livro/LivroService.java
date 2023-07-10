package br.com.biblioteca.bibliocrab.modelo.livro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    @Transactional
    public Livro save(Livro livro) {
        return repository.save(livro);
    }

    public Iterable<Livro> listarTodos() {
        return repository.findAll();
    }
    
    public Livro obterPorID(Long id) {
        return repository.findById(id).get();
    }

}