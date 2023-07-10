package br.com.biblioteca.bibliocrab.api.cadlivros;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca.bibliocrab.api.livro.LivroController;
import br.com.biblioteca.bibliocrab.modelo.cadlivros.CategoriaLivros;
import br.com.biblioteca.bibliocrab.modelo.cadlivros.CategoriaLivrosService;

@RestController
@RequestMapping("/api/categorialivros")
public class CategoriaLivrosController extends LivroController {//nao sei se ta certo o extends

    @Autowired
    private CategoriaLivrosService categoriaLivrosService;

    @PostMapping
    public ResponseEntity<CategoriaLivros> save(@RequestBody @Valid CategoriaLivrosRequest request) {

        CategoriaLivros categoriaLivrosNovo = request.build();
        CategoriaLivros categoriaLivros = categoriaLivrosService.save(categoriaLivrosNovo);
        return new ResponseEntity<CategoriaLivros>(categoriaLivros, HttpStatus.CREATED);
    }

    @GetMapping
    public List<CategoriaLivros> listarTodos() {
  
       return categoriaLivrosService.listarTodos();
    }

    @GetMapping("/{id}")
    public CategoriaLivros obterPorID(@PathVariable Long id) {

       return categoriaLivrosService.obterPorID(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaLivros> update(@PathVariable("id") Long id, @RequestBody CategoriaLivrosRequest request) {

        categoriaLivrosService.update(id, request.build());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        categoriaLivrosService.delete(id);
        return ResponseEntity.ok().build();
    }
    
}

