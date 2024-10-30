public class PayPalProcessor implements PaymentProcessor {
        @Override
        public void process(double amount) {
            System.out.println("payment is being processed by paypal " + "amount: " + amount);

        }
}
//davaleba3
