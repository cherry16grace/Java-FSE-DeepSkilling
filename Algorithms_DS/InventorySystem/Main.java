public class Main{
    public static void main(String[] args) {
        InventoryManager im= new InventoryManager();
        im.addProduct(new Product(1, "Laptop", 10, 55000));
        im.addProduct(new Product(2, "Mouse", 50, 550));

        im.showProducts();

        im.updateProduct(1, 8, 52000);

        im.showProducts();

        im.deleteProduct(2);

        im.showProducts();


    }
}