import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer,Product> map = new HashMap<>();
    //we are going to add products
    public void addProduct(Product p){
        map.put(p.productId,p);
    }

    //we are going to update
    public void updateProduct(int id,int quantity,double price){
        if(map.containsKey(id)){
            Product p=map.get(id);
            p.quantity=quantity;
            p.price=price;
        }

    }

    //we are going to perform delete
    public void deleteProduct(int id){
        map.remove(id);

    }
    // we are going to display
    public void showProducts(){
        for(Product p : map.values()){
            System.out.println(p);
        }
    }
}
