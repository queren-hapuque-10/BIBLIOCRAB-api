package br.com.biblioteca.bibliocrab.modelo.cronograma;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CronogramaService {

    @Autowired
    private CronogramaRepository repository;

    @Transactional
    public Cronograma save(Cronograma cronograma) {
        return repository.save(cronograma);
    }

    public Iterable<Cronograma> listarTodos() {
  
        return repository.findAll();
    }
    
    public Cronograma obterPorID(Long id) {
 
        return repository.findById(id).get();
    }


}
