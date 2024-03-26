package com.store.bestStore.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.bestStore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findAll();

}
