package com.crudproject.controller;

import com.crudproject.dto.CrudModelDto;
import com.crudproject.dto.ResponseCrudModelDto;
import com.crudproject.model.CrudModel;
import com.crudproject.service.CrudSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @Autowired
    private CrudSevice crudSevice;

    @PostMapping("/onboardUser")
   public ResponseEntity<ResponseCrudModelDto> onboardUser(@RequestBody CrudModelDto crudModelDto){
        return crudSevice.onboardUser(crudModelDto);
    }
}
