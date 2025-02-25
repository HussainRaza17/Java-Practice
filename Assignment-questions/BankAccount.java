class BankAccount {
  private String accountNumber;
  private String accountHolderName;
  private double balance;
  private static int totalAccounts = 0;

  public BankAccount() {
      this("Unknown", "Unknown", 0.0);
  }

  public BankAccount(String accountHolderName) {
      this("Unknown", accountHolderName, 0.0);
  }
  
  public BankAccount(String accountNumber, String accountHolderName) {
      this(accountNumber, accountHolderName, 0.0);
  }

  public BankAccount(String accountNumber, String accountHolderName, double balance) {
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
      this.balance = balance;
      totalAccounts++;
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public String getAccountHolderName() {
      return accountHolderName;
  }

  public double getBalance() {
      return balance;
  }

  public static int getTotalAccounts() {
      return totalAccounts;
  }

  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println(amount + " deposited successfully.");
      } else {
          System.out.println("Deposit amount must be positive.");
      }
  }

  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
          System.out.println(amount + " withdrawn successfully.");
      } else {
          System.out.println("Insufficient funds or invalid amount.");
      }
  }

  public int compareTo(BankAccount other) {
      return Double.compare(this.balance, other.balance);
  }

  public static int compareTo(BankAccount b1, BankAccount b2) {
      return Double.compare(b1.balance, b2.balance);
  }

  public void displayAccountDetails() {
      System.out.println("Account Number: " + accountNumber + 
                         ", Holder: " + accountHolderName + 
                         ", Balance: " + balance);
  }

  public static void main(String[] args) {
      BankAccount b1 = new BankAccount("12345", "John Doe", 5000);
      BankAccount b2 = new BankAccount("67890", "Jane Smith", 7000);

      b1.displayAccountDetails();
      b2.displayAccountDetails();

      System.out.println("Comparing balances using instance method: " + b1.compareTo(b2));
      System.out.println("Comparing balances using class method: " + BankAccount.compareTo(b1, b2));

      b1.deposit(2000);
      b1.withdraw(1000);
      b1.displayAccountDetails();
  }
}
