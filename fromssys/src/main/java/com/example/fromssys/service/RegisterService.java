package com.example.fromssys.service;

import com.example.fromssys.model.Register;

import java.util.List;

public interface RegisterService {
    public Register saveRegister(Register register);

   public List<Register> getAllRegister();




}
