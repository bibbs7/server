package com.splitit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  com.splitit.Models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

}
