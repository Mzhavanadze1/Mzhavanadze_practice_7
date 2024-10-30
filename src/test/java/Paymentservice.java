public class Paymentservice {
    static void executePayment(PaymentProcessor paymentProcessor, double amount){
        paymentProcessor.process(amount);
    }
}
//davaleba3