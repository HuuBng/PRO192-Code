
package Part3_AccountManager;

public class Account {
    // Fields
    private String id;
    private String name;
    private int balance;
    
    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getBalance() {
        return balance;
    }
    
    // Others
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    
    public String toString() {
        return "Account[id="+getId()+",name="+getName()+",balance="+getBalance()+"]";
    }
    
}
