package br.futurodev.joiville.m1s10exercicios.services;

import br.futurodev.joiville.m1s10exercicios.dtos.login.LoginRequestDto;
import br.futurodev.joiville.m1s10exercicios.dtos.login.LoginResponseDto;

public interface LoginService {

    LoginResponseDto authenticate(LoginRequestDto dto);

}
