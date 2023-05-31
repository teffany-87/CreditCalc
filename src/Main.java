public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int result = service.calculate(1000000, 12, 9.99);
        System.out.println("Ваш ежемесячный платёж составляет " + result + " рублей.");

        int result2 = service.calculate(1000000, 24, 9.99);
        System.out.println("Ваш ежемесячный платёж составляет " + result2 + " рублей.");

        int result3 = service.calculate(1000000, 36, 9.99);
        System.out.println("Ваш ежемесячный платёж составляет " + result3 + " рублей.");




    }
}
