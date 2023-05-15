package com.desafio.crudpessoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.crudpessoa.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
