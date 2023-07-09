package br.com.biblioteca.bibliocrab.api.logincliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.modelo.logincliente.Logcliente;
import br.com.biblioteca.bibliocrab.modelo.logincliente.LogclienteService;



@RestController
@CrossOrigin
@RequestMapping("/logcliente")
public class LogclienteController {
    
    @Autowired
    private LogclienteService logclienteService;

   @GetMapping
   public Iterable<Logcliente> listarTodos() {
       return logclienteService.listarTodos();
   }

    @PostMapping
    public Logcliente cadastrar(@RequestBody Logcliente logcliente){
    return logclienteService.save(logcliente);
  }
  
   @GetMapping("/{id}")
   public Logcliente obterPorID(@PathVariable Long id) {

       return logclienteService.obterPorID(id);
   }
   /*@PostMapping
   public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

    Cliente cliente = clienteService.save(request.build());
       return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
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
   }*/
}
