public class Gamshvebi3 {
    public static void main(String[] args) {
        CreditCardProcessor card= new CreditCardProcessor();
        PayPalProcessor paypal = new PayPalProcessor();
        Paymentservice.executePayment(card, 30);
        Paymentservice.executePayment(paypal,100);
    }
}
//davaleba3