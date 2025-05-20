package br.futurodev.joiville.m1s10exercicios.services;

import br.futurodev.joiville.m1s10exercicios.dtos.users.UserRequestDto;
import br.futurodev.joiville.m1s10exercicios.dtos.users.UserResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserResponseDto> findAll();
    UserResponseDto findById(Long id);
    UserResponseDto create(UserRequestDto dto);
    UserResponseDto update(Long id, UserRequestDto dto);
    void delete(Long id);

}
