package com.megastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megastore.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
