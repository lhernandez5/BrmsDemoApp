package com.example.brmsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.brmsdemo.objectModel.Account;
import com.example.brmsdemo.service.AccountService;


@RestController
@RequestMapping("/accounts")
public class AccountController {
	private final AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService=accountService;
	}
	
	@PostMapping
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		Account createdAccount = accountService.createAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdAccount);
	}

}
