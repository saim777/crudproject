package com.crudproject.service;

import com.crudproject.dto.CrudModelDto;
import com.crudproject.model.CrudModel;
import com.crudproject.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CrudSevice {

    /*
     * Do Business logic here
     * Compute things
     * Add the data
     * */

    @Autowired
    private CrudRepository crudRepository;

    public void onboardUser(CrudModelDto crudModelDto) {

        CrudModel crudModel=new CrudModel();

        crudModel.setFirstName(crudModelDto.getFirstName());
        crudModel.setLastName(crudModelDto.getLastName());
        crudModel.setEmail(crudModelDto.getEmail());
        crudModel.setCourseId(crudModelDto.getCourseId());
        /*
           'temp' is random generated number
         */
        int randomNumber=1234;
        crudModel.setRandomNumber(randomNumber);
        crudModel.setRegistrationDate(new Date());
        crudRepository.save(crudModel);
    }
}
