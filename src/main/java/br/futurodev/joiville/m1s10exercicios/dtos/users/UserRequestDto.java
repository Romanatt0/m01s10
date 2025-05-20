package br.futurodev.joiville.m1s10exercicios.dtos.users;

import lombok.Data;

@Data
public class UserRequestDto {

    private String name;
    private String username;
    private String password;
    private String role;

}
