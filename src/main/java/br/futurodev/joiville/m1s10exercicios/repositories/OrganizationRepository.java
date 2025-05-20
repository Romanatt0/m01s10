package br.futurodev.joiville.m1s10exercicios.repositories;

import br.futurodev.joiville.m1s10exercicios.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
