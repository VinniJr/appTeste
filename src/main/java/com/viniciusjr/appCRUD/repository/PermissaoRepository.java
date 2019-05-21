package com.viniciusjr.appCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusjr.appCRUD.entity.GrupoEntity;
import com.viniciusjr.appCRUD.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
	 
	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);

}
