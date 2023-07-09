package br.com.biblioteca.bibliocrab.modelo.cadlivros;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LivrosService {

    @Autowired
    private LivrosRepository repository;

    @Transactional
    public Livros save(Livros livros) {
        return repository.save(livros);
    }

    public Iterable<Livros> listarTodos() {
  
        return repository.findAll();
    }
    
    public Livros obterPorID(Long id) {
 
        return repository.findById(id).get();
    }


}
