package com.generation.diskcarona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.diskcarona.model.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
