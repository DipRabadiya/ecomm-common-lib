package com.pesto.ecomm.common.lib.repository;

import com.pesto.ecomm.common.lib.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    Page<Product> findByNameContainingOrDescriptionContaining(String name, String description, Pageable pageable);

    Product findByNameEquals(String name);

}