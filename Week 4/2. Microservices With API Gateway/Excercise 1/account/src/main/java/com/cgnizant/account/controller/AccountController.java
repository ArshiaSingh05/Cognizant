package com.cgnizant.account.controller;

import com.cgnizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(
                number,
                "Savings",
                234343
        );
    }
}