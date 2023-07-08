package br.com.biblioteca.bibliocrab.api.adm;

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

import br.com.biblioteca.bibliocrab.modelo.adm.Adm;
import br.com.biblioteca.bibliocrab.modelo.adm.AdmService;

@RestController
@CrossOrigin
@RequestMapping("/adm")
public class AdmController {
    
    @Autowired
    private AdmService admService;

   @GetMapping
   public Iterable<Adm> listarTodos() {
       return admService.listarTodos();
   }

    @PostMapping
    public Adm cadastrar(@RequestBody Adm adm){
    return admService.save(adm);
  }
  
   @GetMapping("/{id}")
   public Adm obterPorID(@PathVariable Long id) {

       return admService.obterPorID(id);
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