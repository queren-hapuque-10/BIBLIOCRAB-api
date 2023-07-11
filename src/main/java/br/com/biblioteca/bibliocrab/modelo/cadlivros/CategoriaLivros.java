/*package br.com.biblioteca.bibliocrab.modelo.cadlivros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.biblioteca.bibliocrab.api.cadlivros.LivrosController;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CategoriaLivros")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaLivros extends LivrosController {//nao sei de quem extends
    
    private static final long serialVersionUID = -108675714700229624L;
    
    @Column
    private String genero;

}*/