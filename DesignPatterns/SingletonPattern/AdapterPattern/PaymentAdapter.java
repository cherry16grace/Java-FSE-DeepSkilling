class PaymentAdapter implements PaymentProcessor {

    Gateway g=new Gateway();

    public void processPayment() {
        g.makePayment();
    }
}