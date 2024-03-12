package com.project.avatar_bank.controllers;

import com.project.avatar_bank.models.AccountHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping
public class AccountHolderController {

    @Autowired
    AccountHolderService accountHolderService;

//    GET/SHOW
    public ResponseEntity<List<AccountHolder>> getAllAccountHolders() {
        return new ResponseEntity<>(accountHolderService.findAllAccountHolders(), HttpStatus.OK);
    }

    public ResponseEntity<AccountHolder> getAccountHolderById(@PathVariable int id) {
        AccountHolder accountHolder = accountHolderService.findAccountHolderById(id);
        return new ResponseEntity<>(accountHolder, HttpStatus.OK);

    }

//    PUT/EDIT
    public ResponseEntity<AccountHolder> editAccountHolderEmploymentStatus(@RequestBody AccountHolderDTO accountHolderDTO) {
        AccountHolder editEmploymentStatus = accountHolderService.updateAccountHolderEmploymentStatus(accountHolderDTO, id);
        return new ResponseEntity<>(editEmploymentStatus, HttpStatus.OK);

    }

    public ResponseEntity<AccountHolder> editAccountHolderAddress(@RequestBody AccountHolderDTO accountHolderDTO) {
        AccountHolder editAddress = accountHolderService.updateAccountHolderAddress(accountHolderDTO, id);
        return new ResponseEntity<>(editAddress, HttpStatus.OK);

    }

    public ResponseEntity<AccountHolder> editAccountHolderEmail(@RequestBody AccountHolderDTO accountHolderDTO) {
        AccountHolder editEmail = accountHolderService.updateAccountHolderEmail(accountHolderDTO, id);
        return new ResponseEntity<>(editEmail, HttpStatus.OK);

    }

    public ResponseEntity<AccountHolder> editAccountHolderPhoneNumber(@RequestBody AccountHolderDTO accountHolderDTO) {
        AccountHolder editPhoneNumber = accountHolderService.updateAccountHolderPhoneNumber(accountHolderDTO, id);
        return new ResponseEntity<>(editPhoneNumber, HttpStatus.OK);

    }

//    POST/CREATE
    public ResponseEntity<AccountHolder> createNewAccountHolder(@RequestBody AccountHolderDTO accountHolderDTO, @PathVariable int id) {
        accountHolderService.addNewAccountHolder(accountHolderDTO);
        return new ResponseEntity<>(accountHolderService.findAllAccountHolders(), HttpStatus.CREATED);

    }



}
