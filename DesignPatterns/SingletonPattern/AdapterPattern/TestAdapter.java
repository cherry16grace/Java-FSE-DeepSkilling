public class TestAdapter {

    public static void main(String[] args) {

        PaymentProcessor p=
                new PaymentAdapter();

        p.processPayment();
    }
}