package com.generation.diskcarona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.diskcarona.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
