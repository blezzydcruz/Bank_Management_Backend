package com.project.avatar_bank;

import com.project.avatar_bank.controllers.AccountHolderController;
import com.project.avatar_bank.models.AccountHolder;
import com.project.avatar_bank.models.AccountHolderDTO;
import com.project.avatar_bank.models.EmploymentStatus;
import com.project.avatar_bank.repositories.AccountHolderRepository;
import com.project.avatar_bank.services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.project.avatar_bank.models.EmploymentStatus.FULL_TIME;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AccountHolderControllerTests {

    @Autowired
    AccountHolderController accountHolderController;

    @Autowired
    AccountHolderRepository accountHolderRepository;

    @Autowired
    AccountHolderService accountHolderService;

    public void canGetAllAccountHolders() {
        List<AccountHolder> expectedAccountHolders = new ArrayList<>();

        when(accountHolderService.findAllAccountHolders()).thenReturn(expectedAccountHolders);
        ResponseEntity<List<AccountHolder>> allAccountHolders = accountHolderController.getAllAccountHolders();

        assertThat(allAccountHolders.getStatusCode()).isEqualTo(HttpStatus.FOUND);
        assertThat(allAccountHolders.getBody()).isEqualTo(expectedAccountHolders);

    }

    public void canGetAccountHolderById() {
        int id = 1;
        AccountHolder expectedAccountHolder = new AccountHolder();

        when(accountHolderService.findAccountHolderById(id)).thenReturn(expectedAccountHolder);
        ResponseEntity<AccountHolder> foundAccountHolder = accountHolderController.getAccountHolderById(id);

        assertThat(foundAccountHolder.getStatusCode()).isEqualTo(HttpStatus.FOUND);
        assertThat(foundAccountHolder.getBody()).isEqualTo(1);
    }

    public void canEditAccountDetails() {
        AccountHolder mockAccountHolder = new AccountHolder("Anna", "Chan", EmploymentStatus.STUDENT, "12 Wonderland", "annachan@example.com", "annachan!", "0123456", LocalDate.of(2001, 3, 12));
        AccountHolderDTO accountHolderDTO = new AccountHolderDTO();
        accountHolderDTO.setEmploymentStatus(FULL_TIME);
        accountHolderDTO.setAddress("8 Columbia Road");
        accountHolderDTO.setEmail("a.chan1@example.com");
        accountHolderDTO.setPhoneNumber("0987654");

        when(accountHolderService.updateAccountHolderDetails(accountHolderDTO, mockAccountHolder.getId())).thenReturn(mockAccountHolder);
        ResponseEntity<AccountHolder> accountHolder = accountHolderController.editAccountHolderDetails(accountHolderDTO, 1);

        assertThat(accountHolder.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(mockAccountHolder.getEmploymentStatus()).isEqualTo(EmploymentStatus.FULL_TIME);
        assertThat(mockAccountHolder.getAddress()).isEqualTo("8 Columbia Road");
        assertThat(mockAccountHolder.getEmail()).isEqualTo("a.chan1@example.com");
        assertThat(mockAccountHolder.getPhoneNumber()).isEqualTo("0987654");

    }

    public void canCreateNewAccountHolder() {
        AccountHolderDTO accountHolderDTO = new AccountHolderDTO();

        ResponseEntity<AccountHolder> accountHolder = accountHolderController.createNewAccountHolder(accountHolderDTO);

        assertThat(accountHolder.getStatusCode()).isEqualTo(HttpStatus.CREATED);

    }

}
