package com.splitit.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.splitit.Models.Product;
import com.splitit.Models.User;

import org.springframework.data.repository.query.Param;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	//@Query(nativeQuery=true,value="select * FROM products p where p.name= :name")
	//Optional<Product> findByName(@Param("name") String name);

}
