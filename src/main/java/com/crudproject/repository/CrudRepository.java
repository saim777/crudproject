package com.crudproject.repository;

import com.crudproject.model.CrudModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<CrudModel,Integer>{

}
