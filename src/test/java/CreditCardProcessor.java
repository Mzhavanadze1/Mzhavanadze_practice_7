public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) {
        System.out.println("payment is being processed by card " + " amount : " + amount);

    }

}
//davaleba3