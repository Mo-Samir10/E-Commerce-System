package ecommercesystem;


public class Order {
    
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }
    public float totalPrice() {
        for (Product productAdded : products) {
            if (productAdded != null) {
                totalPrice += productAdded.getPrice();}
            }
        return totalPrice;}
    
    public void printOrderInfo(){
        System.out.println("Here is your order is summary:");
        System.out.println("order ID:"+orderId);
        System.out.println("Customer ID:"+customerId);
        System.out.println("products:");
         for (Product productAdded : products) {
            if (productAdded != null) {
               System.out.println(productAdded.getName()+ " = $" + productAdded.getPrice());
            }
        }
      System.out.println("Total Price: $" +totalPrice() );}
        
    }
    
    

