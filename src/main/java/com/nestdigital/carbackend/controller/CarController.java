package com.nestdigital.carbackend.controller;

import com.nestdigital.carbackend.dao.CarDao;
import com.nestdigital.carbackend.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarDao Dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/carEntry",consumes = "application/json", produces = "application/json")
    public String carEntry(@RequestBody CarModel car) {
        System.out.println(car.toString());
        Dao.save(car);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewCar")
    public List<CarModel> viewCar(){
        System.out.println();
        return (List<CarModel>) Dao.findAll();

    }
}
