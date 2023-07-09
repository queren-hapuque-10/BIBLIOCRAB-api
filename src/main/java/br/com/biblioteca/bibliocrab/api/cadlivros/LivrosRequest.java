package br.com.biblioteca.bibliocrab.api.cadlivros;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.biblioteca.bibliocrab.modelo.cadlivros.Livros;
import br.com.biblioteca.bibliocrab.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivrosRequest {

    private Long idCategoriaLivros; 
    
    private String imagem;

    private String titulo;

    private String sinopse;

    private int qtdpag;

    private String autor;
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate lancamento;



    public Livros build() {

        return Livros.builder()
                .imagem(imagem)
                .titulo(titulo)
                .sinopse(sinopse)
                .qtdpag(qtdpag)
                .autor(autor)
                .lancamento(lancamento)
                .build();
    }

}
