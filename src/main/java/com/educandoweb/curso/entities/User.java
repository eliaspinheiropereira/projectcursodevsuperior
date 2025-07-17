package com.educandoweb.curso.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;


}
