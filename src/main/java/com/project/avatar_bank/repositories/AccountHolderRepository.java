package com.project.avatar_bank.repositories;

import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.AccountHolderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {

    List<AccountHolder> findAccountHolderById(int id);


}
