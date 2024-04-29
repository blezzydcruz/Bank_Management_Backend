package com.project.avatar_bank.controllers;

import com.project.avatar_bank.models.BankAccount;
import com.project.avatar_bank.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

//    GET/SHOW
    public ResponseEntity<List<BankAccount>> getAllBankAccounts() {
        return new ResponseEntity<>(bankAccountService.findAllBankAccounts(), HttpStatus.FOUND);
    }
}
