package br.com.biblioteca.bibliocrab.modelo.logincliente;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LogclienteService {

    @Autowired
    private LogclienteRepository repository;

    @Transactional
    public Logcliente save(Logcliente logcliente) {
        return repository.save(logcliente);
    }

    public Iterable<Logcliente> listarTodos() {
  
        return repository.findAll();
    }
    
    public Logcliente obterPorID(Long id) {
 
        return repository.findById(id).get();
    }


}