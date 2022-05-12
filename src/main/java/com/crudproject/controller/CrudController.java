package com.crudproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

    @PostMapping("/onboardUser")
   public void onboardUser(){

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Hello");
    }

}
