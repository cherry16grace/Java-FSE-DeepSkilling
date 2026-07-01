public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder b) {

        cpu=b.cpu;
        ram=b.ram;
        storage=b.storage;
    }

    static class Builder {

        String cpu;
        String ram;
        String storage;

        Builder setCPU(String cpu) {
            this.cpu=cpu;
            return this;
        }

        Builder setRAM(String ram) {
            this.ram=ram;
            return this;
        }

        Builder setStorage(String storage) {
            this.storage=storage;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }

    public void display() {

        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(storage);
    }
}