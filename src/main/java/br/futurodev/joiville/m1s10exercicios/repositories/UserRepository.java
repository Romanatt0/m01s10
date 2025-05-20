package br.futurodev.joiville.m1s10exercicios.repositories;

import br.futurodev.joiville.m1s10exercicios.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
