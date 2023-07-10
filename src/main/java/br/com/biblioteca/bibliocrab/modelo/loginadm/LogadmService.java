package br.com.biblioteca.bibliocrab.modelo.loginadm;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LogadmService {

    @Autowired
    private LogadmRepository repository;

    @Transactional
    public Logadm save(Logadm logadm) {
        return repository.save(logadm);
    }

    public Iterable<Logadm> listarTodos() {
  
        return repository.findAll();
    }
    
    public Logadm obterPorID(Long id) {
 
        return repository.findById(id).get();
    }


}