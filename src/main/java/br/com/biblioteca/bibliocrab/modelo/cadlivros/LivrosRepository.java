package br.com.biblioteca.bibliocrab.modelo.cadlivros;

import org.springframework.data.repository.CrudRepository;

public interface LivrosRepository extends CrudRepository<Livros, Long> {
    
}