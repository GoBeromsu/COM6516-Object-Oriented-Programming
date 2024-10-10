package code2;

public class FoodStore {

    private int amountStored;
    private int amountDeposited;
    private int amountWithdrawn;
    private int totalDepositCount;
    private int totalWithdrawalCount;
    private int refusedTransactionCount;

    public FoodStore(int initialAmount) {
        this.amountStored = initialAmount;
        this.amountDeposited = 0;
        this.amountWithdrawn = 0;
        this.totalDepositCount = 0;
        this.totalWithdrawalCount = 0;
        this.refusedTransactionCount = 0;
    }

    public void processTransaction(int amount) {
        if (amount > 0) {
            depositFood(amount);
        } else if (amount < 0) {
            withdrawFood(-amount);
        } else {
            handleRefusedTransaction("Transaction amount cannot be zero.");
        }
    }
    // Public is required for just TestFood Store
    public void depositFood(int amountToDeposit) {
        amountStored += amountToDeposit;
        amountDeposited += amountToDeposit;
        totalDepositCount++;
        System.out.println("Deposited " + amountToDeposit);
    }
    // Public is required for just TestFood Store
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

    private void handleRefusedTransaction(String message) {
        refusedTransactionCount++;
        System.out.println("Refused transaction: " + message);
    }

    public int getAmountStored() {
        return amountStored;
    }

    public int getTotalDepositCount() {
        return totalDepositCount;
    }

    public int getTotalWithdrawalCount() {
        return totalWithdrawalCount;
    }

    public int getRefusedTransactionCount() {
        return refusedTransactionCount;
    }

    public int getTotalTransactions() {
        return totalDepositCount + totalWithdrawalCount;
    }

    public int getTotalAmountDeposited() {
        return amountDeposited;
    }

    public int getTotalAmountWithdrawn() {
        return amountWithdrawn;
    }
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
