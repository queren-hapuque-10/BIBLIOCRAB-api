package br.com.biblioteca.bibliocrab.api.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public Iterable<Cliente> listarTodos() {
       return clienteService.listarTodos();
   }

   /*  @PostMapping
    public Cliente cadastrar(@RequestBody Cliente cliente){
    return clienteService.save(cliente);
  }*/

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {
    
        Cliente clienteNovo = request.build();
        Cliente cliente = clienteService.save(clienteNovo);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
}


   @GetMapping("/{id}")
   public Cliente obterPorID(@PathVariable Long id) {

       return clienteService.obterPorID(id);
   }


   @PutMapping("/{id}")
   public ResponseEntity<Cliente> update(@PathVariable("id") Long id, @RequestBody ClienteRequest request) {

    clienteService.update(id, request.build());
       return ResponseEntity.ok().build();
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id) {

    clienteService.delete(id);
      return ResponseEntity.ok().build();
   }
}