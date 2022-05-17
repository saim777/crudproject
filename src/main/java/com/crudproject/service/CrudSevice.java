package com.crudproject.service;

import com.crudproject.dto.CrudModelDto;
import com.crudproject.dto.ResponseCrudModelDto;
import com.crudproject.model.CrudModel;
import com.crudproject.repository.CrudRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<ResponseCrudModelDto> onboardUser(CrudModelDto crudModelDto) {

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
        crudModel=crudRepository.save(crudModel);

        ResponseCrudModelDto responseCrudModelDto= ResponseCrudModelDto
                .builder()
                .firstName(crudModel.getFirstName())
                .lastName(crudModel.getLastName())
                .courseId(crudModel.getCourseId())
                .email(crudModel.getEmail())
                .randomNumber(crudModel.getRandomNumber())
                .registrationDate(crudModel.getRegistrationDate())
                .build();
       return new ResponseEntity<ResponseCrudModelDto>(responseCrudModelDto,HttpStatus.OK);
    }
}
