package br.com.biblioteca.bibliocrab.api.cronograma;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.modelo.cronograma.Cronograma;
import br.com.biblioteca.bibliocrab.modelo.cronograma.CronogramaService;

@RestController
@CrossOrigin
@RequestMapping("/cronograma")
public class CronogramaController {
    
    @Autowired
    private CronogramaService cronogramaService;

   @GetMapping
   public Iterable<Cronograma> listarTodos() {
       return cronogramaService.listarTodos();
   }

    @PostMapping
    public Cronograma cadastrar(@RequestBody Cronograma cronograma){
    return cronogramaService.save(cronograma);
  }
  
   @GetMapping("/{id}")
   public Cronograma obterPorID(@PathVariable Long id) {

       return cronogramaService.obterPorID(id);
   }


   /*@PostMapping
   public ResponseEntity<Adm> save(@RequestBody @Valid AdmRequest request) {

    Adm adm = admService.save(request.build());
       return new ResponseEntity<Adm>(adm, HttpStatus.CREATED);
   }



    @PutMapping("/{id}")
   public ResponseEntity<Adm> update(@PathVariable("id") Long id, @RequestBody AdmRequest request) {

    admService.update(id, request.build());
       return ResponseEntity.ok().build();
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id) {

    admService.delete(id);
      return ResponseEntity.ok().build();
   }*/
}
