/**
 * Sai Ram Thota
 * CWID 11573236
 *
 */

public class SavingsAccount {

    private String ownerName;
    private double accountBalance;
    private static double lowInterestRate = .1;
    private static double highInterestRate = .25;

    public SavingsAccount(String ownerName, double accountBalance) {

        this.ownerName = ownerName;
        this.accountBalance = accountBalance;
    }

    public double calculateRate(double accountBalance){

        double rate = 0;

        if(accountBalance < 1000){
            rate = getLowInterestRate();
        }
        else if(accountBalance >= 1000) {
            rate = getHighInterestRate();
        }
        return rate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static double getLowInterestRate() {
        return lowInterestRate;
    }

    public static void setLowInterestRate(double lowInterestRate) {
        SavingsAccount.lowInterestRate = lowInterestRate;
    }

    public static double getHighInterestRate() {
        return highInterestRate;
    }

    public static void setHighInterestRate(double highInterestRate) {
        SavingsAccount.highInterestRate = highInterestRate;
    }
}
