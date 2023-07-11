package br.com.biblioteca.bibliocrab.modelo.cadlivros;
/* 
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.bibliocrab.api.cadlivros.LivrosController;

@Service
public class CategoriaLivrosService extends LivrosController {//nao sei se ta certo o extends
    
    @Autowired
    private CategoriaLivrosRepository repository;

    @Transactional
    public CategoriaLivros save(CategoriaLivros categoriaLivros) {

        super.preencherCamposAuditoria(categoriaLivros);
        return repository.save(categoriaLivros);
    }

    public List<CategoriaLivros> listarTodos() {
  
        return repository.findAll();
    }
 
    public CategoriaLivros obterPorID(Long id) {
 
        return repository.findById(id).get();
    }

    @Transactional
    public void update(Long id, CategoriaLivros categoriaLivrosAlterado) {

        CategoriaLivros categoriaLivros = repository.findById(id).get();
        CategoriaLivros.setGenero(categoriaLivrosAlterado.getGenero());//eu juro que tentei resolver

        super.preencherCamposAuditoria(categoriaLivros);
        repository.save(categoriaLivros);
    }

    @Transactional
    public void delete(Long id) {

        CategoriaLivros categoriaLivros = repository.findById(id).get();
        categoriaLivros.setHabilitado(Boolean.FALSE);
        super.preencherCamposAuditoria(categoriaLivros);

        repository.save(categoriaLivros);
    }

}*/