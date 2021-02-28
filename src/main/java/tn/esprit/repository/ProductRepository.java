package tn.esprit.repository;


import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

	/*@Query("select p from ")
	List<Product> findByName(int name);*/
	
	

}
