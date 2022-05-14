package com.crudproject.service;

import com.crudproject.model.CrudModel;
import com.crudproject.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudSevice {

    /*
     * Do Business logic here
     * Compute things
     * Add the data
     * */

    @Autowired
    private CrudRepository crudRepository;

    public void onboardUser() {

        CrudModel crudModel=new CrudModel();
        crudModel.setName("Saim");
        crudRepository.save(crudModel);

    }
}
