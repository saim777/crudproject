package com.crudproject.controller;

import com.crudproject.service.CrudSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @Autowired
    private CrudSevice crudSevice;

    @PostMapping("/onboardUser")
   public void onboardUser(){
        crudSevice.onboardUser();
    }

}
