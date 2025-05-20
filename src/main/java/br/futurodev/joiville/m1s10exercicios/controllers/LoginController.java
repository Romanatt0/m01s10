package br.futurodev.joiville.m1s10exercicios.controllers;

import br.futurodev.joiville.m1s10exercicios.dtos.login.LoginRequestDto;
import br.futurodev.joiville.m1s10exercicios.dtos.login.LoginResponseDto;
import br.futurodev.joiville.m1s10exercicios.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("login")
public class LoginController {

    private final LoginService service;

    @PostMapping
    public LoginResponseDto login(@RequestBody LoginRequestDto dto) {
        return service.authenticate(dto);
    }

}
