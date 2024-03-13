package com.project.avatar_bank.controllers;

import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.EmploymentStatus;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class AccountHolderControllerTests {

    AccountHolderController accountHolderController;

    public void canGetAllAccountHolders() {
        List<AccountHolder> foundAllAccountHolders = accountHolderRepository.getAllAccountHolders();
    }

    public void canGetAccountHolderById() {
        List<AccountHolder> foundAccountHolder = accountHolderRepository.getAccountHolderById(1);
        assertThat(found.size()).isEqualTo(1);
    }

    public void canEditAccountHolderEmploymentStatus() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!", "0123456", LocalDate.of(2001, 3, 12));

        AccountHolderController.editAccountHolderEmploymentStatus(EmploymentStatus.EMPLOYED);
        assertThat(mockAccountHolder.getEmploymentStatus()).isEqualTo(EmploymentStatus.EMPLOYED);
    }

    public void canEditAccountHolderAddress() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!", "0123456", LocalDate.of(2001, 3, 12));

        AccountHolderController.editAccountHolderAddress("8 Columbia Road");
        assertThat(mockAccountHolder.getAddress()).isEqualTo("8 Columbia Road");
    }

    public void canEditAccountHolderEmail() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!","0123456", LocalDate.of(2001, 3, 12));

        AccountHolderController.editAccountHolderEmail("a.chan1@example.com");
        assertThat(mockAccountHolder.getEmail()).isEqualTo("a.chan1@example.com");

    }

    public void canEditAccountHolderPhoneNumber() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!","0123456", LocalDate.of(2001, 3, 12));

        AccountHolderController.editAccountHolderPhoneNumber("0987654");
        assertThat(mockAccountHolder.getPhoneNumber()).isEqualTo("0987654");

    }

    public void canCreateNewAccountHolder() {
        AccountHolder newMockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!","0123456", LocalDate.of(2001, 3, 12));
        accountHolderRepository.save(newMockAccountHolder);

    }

}
