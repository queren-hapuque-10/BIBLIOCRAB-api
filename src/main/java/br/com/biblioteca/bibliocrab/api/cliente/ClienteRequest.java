package br.com.biblioteca.bibliocrab.api.cliente;

import java.time.LocalDate;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.biblioteca.bibliocrab.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
 
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    private String celular;

    private String cpf;

    private String rg;

    private String endereco;

    private String email;

    private String senha;

    public Cliente build() {

        return Cliente.builder()
                .nome(nome)
                .dataNascimento(dataNascimento)
                .celular(celular)
                .cpf(cpf)
                .rg(rg)
                .endereco(endereco)
                .email(email)
                .senha(senha)
                .build();
    }

}
