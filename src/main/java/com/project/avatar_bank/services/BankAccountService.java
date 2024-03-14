package com.project.avatar_bank.services;

import com.project.avatar_bank.models.BankAccount;
import com.project.avatar_bank.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;

//    GET/SHOW
    public List<BankAccount> findAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

}
