import java.util.*;

public class SearchDemo {

    // LINEAR SEARCH
    public static Product linearSearch(Product[] arr, String name) {
        for (Product p : arr) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // BINARY SEARCH 
    public static Product binarySearch(Product[] arr, String name) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = arr[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)
                return arr[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = new Product[4];

        products[0] = new Product(1, "Laptop", "Electronics");
        products[1] = new Product(2, "Shoes", "Fashion");
        products[2] = new Product(3, "Phone", "Electronics");
        products[3] = new Product(4, "Watch", "Accessories");

        System.out.println("Linear Search Result:");
        System.out.println(linearSearch(products, "Phone"));

        
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].productName.compareToIgnoreCase(products[j].productName) > 0) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("\nBinary Search Result:");
        System.out.println(binarySearch(products, "Phone"));
    }
}