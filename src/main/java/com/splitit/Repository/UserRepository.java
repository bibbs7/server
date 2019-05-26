package com.splitit.Repository;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.splitit.Models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//@Query(nativeQuery = true,value= "select * from users u where u.name= :name")
	//User findByName(@Param("name") String name);

	//@Query(nativeQuery = true,value= "select * from users u where u.id= :id")
	//User findById(@Param("id") String id);

}