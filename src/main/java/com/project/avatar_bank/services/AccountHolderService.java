package com.project.avatar_bank.services;

import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.AccountHolderDTO;
import com.project.avatar_bank.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.NoSuchElementException;

@Service
public class AccountHolderService {

    @Autowired
    AccountHolderRepository accountHolderRepository;

//    GET/SHOW
    public List<AccountHolder> findAllAccountHolders() {
        return accountHolderRepository.findAll();
    }

    public AccountHolder findAccountHolderById(int id) {
        return accountHolderRepository.findById(id).get();
    }

////    PUT/EDIT
//    public AccountHolder updateAccountHolderDetails(AccountHolderDTO accountHolderDTO, int id) {
//        AccountHolder toEditAccountHolder = accountHolderRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No account found"));
//
//        toEditAccountHolder.setEmploymentStatus(accountHolderDTO.getEmploymentStatus());
//        toEditAccountHolder.setAddress(accountHolderDTO.getAddress());
//        toEditAccountHolder.setEmail(accountHolderDTO.getEmail());
//        toEditAccountHolder.setPhoneNumber(accountHolderDTO.getPhoneNumber());
//
//        accountHolderRepository.save(toEditAccountHolder);
//        return toEditAccountHolder;
//    }

//    POST/CREATE
    public AccountHolder addNewAccountHolder(AccountHolderDTO accountHolderDTO) {
        AccountHolder newAccountHolder = new AccountHolder(accountHolderDTO.getFirstName(), accountHolderDTO.getLastName(), accountHolderDTO.getEmploymentStatus(), accountHolderDTO.getAddress(), accountHolderDTO.getEmail(), accountHolderDTO.getPassword(), accountHolderDTO.getPhoneNumber(), accountHolderDTO.getDateOfBirth());
        return accountHolderRepository.save(newAccountHolder);
    }

}
