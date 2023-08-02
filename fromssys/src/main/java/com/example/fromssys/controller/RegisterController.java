package com.example.fromssys.controller;

import com.example.fromssys.model.Register;
import com.example.fromssys.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {


    @Autowired
    private RegisterService registerService;

    @PostMapping("/add")
    public String add(@RequestBody Register register) {
        registerService.saveRegister(register);
        return "Dodano do bazy";
    }
    @GetMapping("/getAll")
    public List<Register>getAllRegister()
    {
     return registerService.getAllRegister();
    };

}
