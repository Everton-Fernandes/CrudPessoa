package com.desafio.crudpessoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.crudpessoa.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
