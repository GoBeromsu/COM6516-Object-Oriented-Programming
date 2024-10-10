package code2;

public class FoodStore {

    // Variables for storing food amount and tracking deposits/withdrawals
    private int amountStored;
    private int amountDeposited;
    private int amountWithdrawn;
    private int totalDepositCount;
    private int totalWithdrawalCount;
    private int refusedTransactionCount;

    // Constructor to initialize the initial amount of food in the store
    public FoodStore(int initialAmount) {
        this.amountStored = initialAmount;
        this.amountDeposited = 0;
        this.amountWithdrawn = 0;
        this.totalDepositCount = 0;
        this.totalWithdrawalCount = 0;
        this.refusedTransactionCount = 0;
    }

    // Processes a transaction based on the amount: deposits if positive, withdraws if negative
    public void processTransaction(int amount) {
        if (amount > 0) {
            depositFood(amount);
        } else if (amount < 0) {
            withdrawFood(-amount);
        } else {
            handleRefusedTransaction("Transaction amount cannot be zero.");
        }
    }

    // Public method to deposit food, increments the stored amount and records the transaction
    public void depositFood(int amountToDeposit) {
        amountStored += amountToDeposit;
        amountDeposited += amountToDeposit;
        totalDepositCount++;
        System.out.println("Deposited " + amountToDeposit);
    }

    // Public method to withdraw food, decrements the stored amount if sufficient food is available
    public void withdrawFood(int amountToWithdraw) {
        if (amountStored >= amountToWithdraw) {
            amountStored -= amountToWithdraw;
            amountWithdrawn += amountToWithdraw;
            totalWithdrawalCount++;
            System.out.println("Withdrew " + amountToWithdraw);
        } else {
            handleRefusedTransaction("Not enough food for this withdrawal.");
        }
    }

    // Private method to handle and log a refused transaction with a custom message
    private void handleRefusedTransaction(String message) {
        refusedTransactionCount++;
        System.out.println("Refused transaction: " + message);
    }

    // Getter for the amount of food stored
    public int getAmountStored() {
        return amountStored;
    }

    // Getter for the total number of deposits made
    public int getTotalDepositCount() {
        return totalDepositCount;
    }

    // Getter for the total number of withdrawals made
    public int getTotalWithdrawalCount() {
        return totalWithdrawalCount;
    }

    // Getter for the total number of refused transactions
    public int getRefusedTransactionCount() {
        return refusedTransactionCount;
    }

    // Returns the total number of transactions (deposits and withdrawals)
    public int getTotalTransactions() {
        return totalDepositCount + totalWithdrawalCount;
    }

    // Getter for the total amount of food deposited
    public int getTotalAmountDeposited() {
        return amountDeposited;
    }

    // Getter for the total amount of food withdrawn
    public int getTotalAmountWithdrawn() {
        return amountWithdrawn;
    }

    // Override equals method to compare two FoodStore objects for equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FoodStore other = (FoodStore) obj;
        return amountStored == other.amountStored
                && amountDeposited == other.amountDeposited
                && amountWithdrawn == other.amountWithdrawn
                && totalDepositCount == other.totalDepositCount
                && totalWithdrawalCount == other.totalWithdrawalCount
                && refusedTransactionCount == other.refusedTransactionCount;
    }

    // Override toString method to provide a readable summary of the FoodStore state
    @Override
    public String toString() {
        return (
                "AmountStored = " + amountStored + "\n" +
                        "TotalAmountDeposited = " + amountDeposited + "\n" +
                        "TotalAmountWithdrawn = " + amountWithdrawn + "\n" +
                        "TotalDepositCount = " + totalDepositCount + "\n" +
                        "TotalWithdrawalCount = " + totalWithdrawalCount + "\n" +
                        "RefusedTransactionCount = " + refusedTransactionCount + "\n" +
                        "TotalTransactions = " + getTotalTransactions()
        );
    }
}
