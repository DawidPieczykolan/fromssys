package com.example.fromssys.service;


import com.example.fromssys.model.Register;
import com.example.fromssys.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl  implements  RegisterService
{


    @Autowired
   public RegisterRepository registerRepository;


    @Override
    public List<Register> getAllRegister() {
        return registerRepository.findAll();
    }

    @Override
    public Register saveRegister(Register register) {
        return registerRepository.save(register);
    }
}

