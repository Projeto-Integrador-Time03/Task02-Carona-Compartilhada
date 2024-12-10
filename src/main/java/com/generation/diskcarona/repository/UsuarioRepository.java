package com.generation.diskcarona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.diskcarona.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 
	
}
