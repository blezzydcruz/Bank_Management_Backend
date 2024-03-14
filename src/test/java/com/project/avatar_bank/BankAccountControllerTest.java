package com.project.avatar_bank;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Array;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BankAccountControllerTest {

    BankAccountController bankAccountController;
    BankAccountService  bankAccountService;

    BankAccountRepository bankAccountRepository;

    public void canGetAllBankAccounts() {
        List<BankAccount> expectedBankAccounts = new ArrayList<>();

        when(bankAccountService.findAllBankAccounts()).thenReturn(expectedBankAccounts);
        ResponseEntity<List<BankAccount>> allBankAccounts = bankAccountController.getAllBankAccounts();

        assertThat(allBankAccounts.getStatusCode()).isEqualTo(HttpStatus.FOUND);
        assertThat(allBankAccounts.getBody()).isEqualTo(expectedBankAccounts);

    }

    public void canGetBankAccountById() {

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
