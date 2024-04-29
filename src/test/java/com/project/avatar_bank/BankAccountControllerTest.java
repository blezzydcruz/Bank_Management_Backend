package com.project.avatar_bank;

import com.project.avatar_bank.controllers.BankAccountController;
import com.project.avatar_bank.models.BankAccount;
import com.project.avatar_bank.repositories.BankAccountRepository;
import com.project.avatar_bank.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BankAccountControllerTest {

    @Autowired
    BankAccountController bankAccountController;
    @Autowired
    BankAccountService bankAccountService;
    @Autowired
    BankAccountRepository bankAccountRepository;

    public void canGetAllBankAccounts() {
        List<BankAccount> expectedBankAccounts = new ArrayList<>();

        when(bankAccountService.findAllBankAccounts()).thenReturn(expectedBankAccounts);
        ResponseEntity<List<BankAccount>> allBankAccounts = bankAccountController.getAllBankAccounts();

        assertThat(allBankAccounts.getStatusCode()).isEqualTo(HttpStatus.FOUND);
        assertThat(allBankAccounts.getBody()).isEqualTo(expectedBankAccounts);

    }

    public void canGetBankAccountById() {
        BankAccount expectedBankAccount = new BankAccount();
        expectedBankAccount.setId(1);

        when(bankAccountService.findBankAccountById(1).thenReturn(expectedBankAccount));
        ResponseEntity<BankAccount> foundBankAccount = bankAccountController.getBankAccountById(1);

        assertThat(foundBankAccount.getStatusCode()).isEqualTo(HttpStatus.FOUND);
        assertThat(foundBankAccount.getBody()).isEqualTo(expectedBankAccount.getId());

    }

    public void canGetBankAccountByType() {

    }


    public void canCreateNewBankAccount() {

    }

    public void canDeleteBankAccount() {

    }

    public void canGetAllTransactionsOfBankAccount() {

    }
}
