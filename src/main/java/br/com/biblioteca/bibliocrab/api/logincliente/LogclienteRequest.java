package br.com.biblioteca.bibliocrab.api.logincliente;

import br.com.biblioteca.bibliocrab.modelo.logincliente.Logcliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogclienteRequest {
 
    private String email;

    private String senha;

    public Logcliente build() {

        return Logcliente.builder()
                .email(email)
                .senha(senha)
                .build();
    }

}
