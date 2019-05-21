package com.viniciusjr.appCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusjr.appCRUD.entity.GrupoEntity;
import com.viniciusjr.appCRUD.entity.UsuarioEntity;

public interface GrupoRepository extends JpaRepository<GrupoEntity, Long>{
	 
		List<GrupoEntity> findByUsuariosIn(UsuarioEntity usuarioEntity);
}
