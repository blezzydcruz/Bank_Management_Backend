package com.project.avatar_bank.services;

import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.AccountHolderDTO;
import com.project.avatar_bank.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

//    PUT/EDIT
    public AccountHolder updateAccountHolderEmploymentStatus(AccountHolderDTO accountHolderDTO, int id) {
        AccountHolder toEditEmploymentStatus = accountHolderRepository.findById(id).get();
        toEditEmploymentStatus.setEmploymentStatus(accountHolderDTO.getEmploymentStatus());
        accountHolderRepository.save(toEditEmploymentStatus);
        return toEditEmploymentStatus;
    }


}
