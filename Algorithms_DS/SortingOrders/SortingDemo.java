public class SortingDemo {
    public static void bubbleSort(Order[] orders){
        for(int i=0;i<orders.length-1;i++){
            for(int j=0;j<orders.length-i-1;j++){
                if(orders[j].price>orders[j+1].price){
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
    }
    public static void quickSort(Order[] orders,int low,int high){
        if(low<high){
            int pivot =partition(orders,low,high);
            quickSort(orders,low,pivot-1);
            quickSort(orders,pivot+1,high);

        }
    }
    public static int partition(Order[] orders,int low,int high){
        double pivot =orders[high].price;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(orders[j].price<pivot){
                i++;
                Order temp=orders[i];
                orders[i]=orders[j];
                orders[j]=temp;
            }
        }
        Order temp=orders[i+1];
        orders[i+1]=orders[high];
        orders[high]=temp;
        return i+1;
    }
     public static void display(Order[] orders) {


        for(Order o : orders) {

            System.out.println(o);
        }
    }
    public static void main(String[] args) {



        Order[] orders = {


            new Order(1,"Alice",5000),

            new Order(2,"Bob",1500),

            new Order(3,"John",8000),

            new Order(4,"David",3000)

        };



        System.out.println("Before Sorting:");

        display(orders);



        System.out.println("\nBubble Sort:");

        bubbleSort(orders);

        display(orders);




        Order[] orders2 = {


            new Order(1,"Alice",5000),

            new Order(2,"Bob",1500),

            new Order(3,"John",8000),

            new Order(4,"David",3000)

        };



        System.out.println("\nQuick Sort:");

        quickSort(orders2,0,orders2.length-1);

        display(orders2);

    }



}
