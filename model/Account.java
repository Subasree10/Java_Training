package model;

public abstract class Account {
    private Integer accountNumber;
    private String holderName;
    private Double balance;

    public Account(Integer accountNumber, String holderName, Double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation
    public Integer getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public Double getBalance() { return balance; }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    // Abstract methods (Abstraction)
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount);

    public void display() {
        System.out.println("Acc No: " + accountNumber +
                ", Name: " + holderName +
                ", Balance: " + balance);
    }
}
