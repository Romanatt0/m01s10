package br.futurodev.joiville.m1s10exercicios.controllers;

import br.futurodev.joiville.m1s10exercicios.dtos.users.UserRequestDto;
import br.futurodev.joiville.m1s10exercicios.dtos.users.UserResponseDto;
import br.futurodev.joiville.m1s10exercicios.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private final UserService service;

    @GetMapping
    public List<UserResponseDto> findAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public UserResponseDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto create(@RequestBody UserRequestDto dto) {
        return service.create(dto);
    }

    @PutMapping("{id}")
    public UserResponseDto update(@PathVariable Long id, @RequestBody UserRequestDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
