package com.project.avatar_bank.services;

import com.project.avatar_bank.models.BankAccount;
import com.project.avatar_bank.models.BankAccountDTO;
import com.project.avatar_bank.models.BankAccountType;
import com.project.avatar_bank.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;

    @Autowired
    BankAccountType bankAccountType;

//    GET/SHOW
    public List<BankAccount> findAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

    public BankAccount findBankAccountById(int id) {
        return bankAccountRepository.findById(id).get();
    }

//    POST/CREATE
    public BankAccount addNewBankAccount(BankAccountDTO bankAccountDTO) {
        BankAccount newBankAccount = new BankAccount(bankAccountDTO.getAccountNumber(), bankAccountDTO.getSortCode(), bankAccountDTO.getBalance(), bankAccountDTO.getBankAccountType());
        return bankAccountRepository.save(newBankAccount);
        
    }

}
