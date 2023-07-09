package br.com.biblioteca.bibliocrab.api.loginadm;

import br.com.biblioteca.bibliocrab.modelo.loginadm.Logadm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogadmRequest {
 
    private String email;

    private String senha;

    public Logadm build() {

        return Logadm.builder()
                .email(email)
                .senha(senha)
                .build();
    }

}
