package service;

import model.*;
import java.util.*;

public class BankService {

    private List<Account> accounts = new ArrayList<>();

    public void createAccount(Account acc) {
        accounts.add(acc);
    }

    public Account findAccount(Integer accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(Integer accNo, Double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        }
    }

    public void withdraw(Integer accNo, Double amount) {
        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        }
    }

    public void displayAll() {
        for (Account acc : accounts) {
            acc.display();
        }
    }
}