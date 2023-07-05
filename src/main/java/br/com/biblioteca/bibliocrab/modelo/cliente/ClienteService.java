package br.com.biblioteca.bibliocrab.modelo.cliente;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
  
        return repository.findAll();
    }
 
    public Cliente obterPorID(Long id) {
 
        return repository.findById(id).get();
    }


}