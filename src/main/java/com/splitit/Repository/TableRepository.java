package com.splitit.Repository;

import org.springframework.stereotype.Repository;
import  com.splitit.Models.Tables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface TableRepository extends JpaRepository<Tables, Long> {

}
