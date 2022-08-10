package com.sashiri.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.sashiri.restapi.model.UsuarioModel;

//Repositório para a classe CrudRepository que já vem com os principais métodos.
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{
    
}
