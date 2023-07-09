package br.com.biblioteca.bibliocrab.api.cadlivros;
import br.com.biblioteca.bibliocrab.modelo.cadlivros.CategoriaLivros;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaLivrosRequest {

    private String genero;

    public CategoriaLivros build() {

        return CategoriaLivros.builder()
            .genero(genero)
            .build();
    }
    
}