package model;

public class CurrentAccount extends Account {

    private final Double overdraftLimit = 1000.0;

    public CurrentAccount(Integer accNo, String name, Double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void deposit(Double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(Double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
