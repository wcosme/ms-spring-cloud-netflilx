package br.com.wgsolution.msproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wgsolution.msproduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
