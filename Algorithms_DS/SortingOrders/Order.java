public class Order {
    int orderId;
    String customerName;
    double price;

    public Order(int orderId,String customerName,double price){
        this.orderId=orderId;
        this.customerName=customerName;
        this.price=this.price;
    }
    public String toString(){
        return orderId + "|" + customerName + "|" + price;
    }
}
