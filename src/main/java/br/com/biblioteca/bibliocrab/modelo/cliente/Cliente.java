package br.com.biblioteca.bibliocrab.modelo.cliente;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import org.hibernate.annotations.Where;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Component
@Table(name = "Cliente")
@Builder
@Getter
@Setter
public class Cliente {
    
    private static final long serialVersionUID = 6744535953108071602L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;

    @Column
    private String nome;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String celular;

    @Column
    private String cpf;

    @Column
    private String rg;

    @Column
    private String endereco;

    @Column
    private String email;

    @Column
    private String senha;

}