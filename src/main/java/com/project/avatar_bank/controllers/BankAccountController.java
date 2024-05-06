package com.project.avatar_bank.controllers;

import com.project.avatar_bank.models.BankAccount;
import com.project.avatar_bank.models.BankAccountDTO;
import com.project.avatar_bank.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

//    GET/SHOW
    public ResponseEntity<List<BankAccount>> getAllBankAccounts() {
        return new ResponseEntity<>(bankAccountService.findAllBankAccounts(), HttpStatus.FOUND);
    }

    public ResponseEntity<BankAccount> getBankAccountById(@PathVariable int id) {
        BankAccount bankAccount = bankAccountService.findBankAccountById(id);
        return new ResponseEntity<>(bankAccount, HttpStatus.OK);
    }

//    POST/CREATE
    public ResponseEntity<BankAccount> createNewBankAccount(@RequestBody BankAccountDTO bankAccountDTO) {
        bankAccountService.addNewBankAccount(bankAccountDTO);
        return new ResponseEntity<>(bankAccountService.addNewBankAccount(bankAccountDTO), HttpStatus.CREATED);
        
    }
}
