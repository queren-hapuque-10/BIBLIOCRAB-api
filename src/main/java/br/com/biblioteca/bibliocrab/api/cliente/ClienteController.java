package br.com.biblioteca.bibliocrab.api.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.modelo.cliente.Cliente;
import br.com.biblioteca.bibliocrab.modelo.cliente.ClienteService;



@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

   @PostMapping
   public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

    Cliente cliente = clienteService.save(request.build());
       return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
   }

   @GetMapping("/listar")
   public Iterable<Cliente> listarTodos() {
       return clienteService.listarTodos();
   }

   @GetMapping("/{id}")
   public Cliente obterPorID(@PathVariable Long id) {

       return clienteService.obterPorID(id);
   }

}