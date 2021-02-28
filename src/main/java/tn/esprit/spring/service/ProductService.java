package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.ProductRepository;
import tn.esprit.spring.entities.Product;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	
	
	
	

}
