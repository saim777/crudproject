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

    public void onboardUser(String firstName,String lastName,String email) {

        CrudModel crudModel=new CrudModel();
        crudModel.setFirstName(firstName);
        crudModel.setLastName(lastName);
        crudModel.setEmail(email);
        /*
           'temp' is random generated number
         */
        int randomNumber=1234;
        crudModel.setRandomNumber(randomNumber);
        crudRepository.save(crudModel);
    }
}
