package com.yuan.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository rep;

    @GetMapping(value = "/list")
    public List<Girl> girlList(){

        System.out.println("llllllllllllllllllllllllllllllllll");
        return rep.findAll();
    }


}
