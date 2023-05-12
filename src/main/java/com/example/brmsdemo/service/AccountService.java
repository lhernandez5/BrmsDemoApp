package com.example.brmsdemo.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.brmsdemo.objectModel.Account;
import com.example.brmsdemo.objectModel.Transaction;

@Service
public class AccountService {
	@Autowired
	private KieContainer kieContainer;
	
	public AccountService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }
	
	public Account createAccount(Account account) {
        // Business logic for creating an account
        // Apply rules using kieContainer.getKieSession()
        return account;
    }
	
	public void performTransaction(Transaction transaction) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(transaction);// Insert the transaction into the session
		kieSession.fireAllRules();//Execure the rules
		kieSession.dispose();//Clean up the session
		//Perform any additional logic based on the outcome of the rules
	}

}
