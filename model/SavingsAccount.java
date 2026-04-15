package model;

public class SavingsAccount extends Account {

    public SavingsAccount(Integer accNo, String name, Double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(Double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(Double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}