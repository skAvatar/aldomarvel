package com.aldo.test.controller;

import com.aldo.test.request.ColaboratorsRequest;
import com.aldo.test.services.CapAmericaColaboratorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CapAmericaColaboratorsController {

    @Autowired
    private CapAmericaColaboratorsServices capAmericaServices;

    @GetMapping("")
    public void get(@RequestBody ColaboratorsRequest colaboratorsRequest){
        capAmericaServices.get();
    }

}
