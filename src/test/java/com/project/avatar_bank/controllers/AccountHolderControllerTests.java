package com.project.avatar_bank.controllers;

import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class AccountHolderControllerTests {

    public void canGetAccountHolderById() {
        List<AccountHolder> foundAccountHolder = accountHolderRepository.getAccountHolderById(1);
        assertThat(found.size()).isEqualTo(1);
    }

    public void canEditAccountHolderEmploymentStatus() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "0123456", LocalDate.of(2001, 3, 12));

        mockAccountholder.editAccountHolderEmploymentStatus(EmploymentStatus.EMPLOYED);
        assertThat(mockAccountHolder.getEmploymentStatus()).isEqualTo(EmploymentStatus.EMPLOYED);
    }

    public void canEditAccountHolderAddress() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "0123456", LocalDate.of(2001, 3, 12));

        mockAccountholder.editAccountHolderAddress("8 Columbia Road");
        assertThat(mockAccountHolder.getAddress()).isEqualTo("8 Columbia Road");
    }

    public void canEditAccountHolderEmail() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "0123456", LocalDate.of(2001, 3, 12));

        mockAccountholder.editAccountHolderEmail("a.chan1@example.com");
        assertThat(mockAccountHolder.getEmail()).isEqualTo("a.chan1@example.com");

    }

    public void canEditAccountHolderPhoneNumber() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "0123456", LocalDate.of(2001, 3, 12));

        mockAccountholder.editAccountHolderPhoneNumber("0987654");
        assertThat(mockAccountHolder.getPhoneNumber()).isEqualTo("0987654");

    }

    public void canCreateNewAccountHolder() {
        AccountHolder newMockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "0123456", LocalDate.of(2001, 3, 12));
        accountHolderRepository.save(newMockAccountHolder);

    }

}
