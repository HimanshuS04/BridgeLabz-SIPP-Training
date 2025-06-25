public class bankAccount {

    // Static variable
    static String bankName = "MyBank";
    // Static variable to track the number of accounts
    private static int totalAccounts = 0;
    // Final variable
    private final String accountNumber;
    private String accountHolderName;

    // Constructor
    public bankAccount(String accountHolderName, String accountNumber) {
        // Use 'this' to resolve ambiguity
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment the total number of accounts
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
    }

    public static void main(String[] args) {
        bankAccount account1 = new bankAccount("John Doe", "12345");
        bankAccount account2 = new bankAccount("Jane Smith", "67890");

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Total Accounts: " + bankAccount.getTotalAccounts());

        // Instanceof check
        if (account1 instanceof bankAccount) {
            System.out.println("account1 is an instance of BankAccount");
        }

        //Demonstrating that accountNumber cannot be changed
        //account1.accountNumber = "99999"; //This line would cause a compilation error

        account1.setAccountHolderName("John Updated");
        account1.displayAccountDetails();
    }
}
