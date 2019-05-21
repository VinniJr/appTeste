package com.viniciusjr.appCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusjr.appCRUD.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	 
	UsuarioEntity findByLogin(String login);

}
