package com.project.avatar_bank.controllers;

import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class AccountHolderControllerTests {

    public void canGetAccountHolderById() {
        List<AccountHolder> foundAccountHolder = findAccountHolderById(1L);
        assertThat(found.size()).isEqualTo(1);
    }

}
