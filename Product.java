package ecommercesystem;

public class Product {
    protected int productId;
    protected String name;
    protected float price;

    public Product(int productId,String name,float price){
        this.price=Math.abs(price);
        this.name=name;
        this.productId=Math.abs(productId);        
    }
            public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);}
    }
    
