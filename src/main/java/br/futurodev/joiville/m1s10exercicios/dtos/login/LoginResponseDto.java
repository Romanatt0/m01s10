package br.futurodev.joiville.m1s10exercicios.dtos.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponseDto {

    private String type;
    private String token;

}
