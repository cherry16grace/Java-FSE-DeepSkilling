public class TestBuilder {

    public static void main(String[] args) {

        Computer c=
                new Computer.Builder()
                .setCPU("i7")
                .setRAM("16GB")
                .setStorage("1TB")
                .build();

        c.display();
    }
}