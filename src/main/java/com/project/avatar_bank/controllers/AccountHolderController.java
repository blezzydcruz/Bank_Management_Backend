package com.project.avatar_bank.controllers;

import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.AccountHolderDTO;
import com.project.avatar_bank.services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping
public class AccountHolderController {

    @Autowired
    AccountHolderService accountHolderService;


//    GET/SHOW
    public ResponseEntity<List<AccountHolder>> getAllAccountHolders() {
        return new ResponseEntity<>(accountHolderService.findAllAccountHolders(), HttpStatus.FOUND);

    }

    public ResponseEntity<AccountHolder> getAccountHolderById(@PathVariable int id) {
        try {
            AccountHolder accountHolder = accountHolderService.findAccountHolderById(id);
            return new ResponseEntity<>(accountHolder, HttpStatus.FOUND);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

//    PUT/EDIT
    public ResponseEntity<AccountHolder> editAccountHolderDetails(@RequestBody AccountHolderDTO accountHolderDTO, @PathVariable int id) {
        AccountHolder editAccountHolder = accountHolderService.updateAccountHolderDetails(accountHolderDTO, id);
        return new ResponseEntity<>(editAccountHolder, HttpStatus.OK);

    }

//    POST/CREATE
    public ResponseEntity<AccountHolder> createNewAccountHolder(@RequestBody AccountHolderDTO accountHolderDTO) {
        AccountHolder newAccountHolder = accountHolderService.addNewAccountHolder(accountHolderDTO);
        return new ResponseEntity<>(newAccountHolder, HttpStatus.CREATED);

    }

}
