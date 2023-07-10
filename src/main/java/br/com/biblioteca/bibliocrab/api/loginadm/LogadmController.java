package br.com.biblioteca.bibliocrab.api.loginadm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.modelo.loginadm.Logadm;
import br.com.biblioteca.bibliocrab.modelo.loginadm.LogadmService;



@RestController
@CrossOrigin
@RequestMapping("/logadm")
public class LogadmController {
    
    @Autowired
    private LogadmService logadmService;

   @GetMapping
   public Iterable<Logadm> listarTodos() {
       return logadmService.listarTodos();
   }

    @PostMapping
    public Logadm cadastrar(@RequestBody Logadm logadm){
    return logadmService.save(logadm);
  }
  
   @GetMapping("/{id}")
   public Logadm obterPorID(@PathVariable Long id) {

       return logadmService.obterPorID(id);
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
