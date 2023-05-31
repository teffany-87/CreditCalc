public class CreditPaymentService {
    public int calculate(long amountOfCredit, int creditTerm, double annualInterestRate) {

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return (int) ((int) amountOfCredit * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, creditTerm) - 1)));
    }
}
