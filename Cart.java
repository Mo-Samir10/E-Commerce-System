package ecommercesystem;


public class Cart {
    private int customerId;
    private int nProducts; 
    private Product[] products;
    
    public Cart(int customerId,int nProducts){
        this.customerId=Math.abs(customerId);
        this.nProducts=Math.abs(nProducts);
        this.products=new Product[nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

     public void addProduct(Product productAdded, int i) {
        if (i >= 0 && i< nProducts) {
            products[i] = productAdded;
        } else {
            System.out.println("you didn’t add product to your cart"); }
        }
    
    public void removeProduct(int i) {
        if (i >= 0 && i < nProducts) {
            products[i] = null;
        } else {
            System.out.println("your cart is empty ! nothing to remove"); }
        }
    
    public float calculatePrice() {
        float total = 0;
        for (Product productAdded : products) {
            if (productAdded != null) {
                total += productAdded.getPrice(); }
            }
        return total;
    }
    
    public void placeOrder(int orderId) {
        System.out.println("order ID: " + orderId);
    }

}
