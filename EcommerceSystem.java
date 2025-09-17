package ecommercesystem;
import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ElectonicProduct e1=new ElectonicProduct(1,"smartphone",599.9f,"Samsung",1);
        ClothingProduct e2= new ClothingProduct(2,"T-shirt",19.99f,"Medium","cotton");
        BookProduct e3=new BookProduct(3,"OOP",39.99f,"O’Reilly","X Publications");
        Customer e4=new Customer(23011475,"Mohamed Samir Abdallah","Moharam-Bek");
        
        System.out.println("welcome to E-Commerse System!\nplease enter your id");
        int id=cs.nextInt();
        System.out.println("plese enter your name");
        String name =cs.next();
        System.out.println("plese enter your address");
        String addr =cs.next();
        System.out.println("How many products you want to add to your cart");
        int prNo=cs.nextInt();
        
        Cart e5=new Cart(id,prNo);
        Order e6=new Order(id,1,e5.getProducts());
        
        for(int i=0;i<prNo;i++){
        System.out.println("Which product would you like to add ? 1- smartphone 2- T-shirt 3- oop");
        int add=cs.nextInt();
         switch (add) {
                case 1:
                    e5.addProduct(e1, i);
                    break;
                case 2:
                    e5.addProduct(e2, i);
                    break;
                case 3:
                    e5.addProduct(e3, i);
                    break;}
        }
        System.out.println("your total is $"+e5.calculatePrice()+".would you like to place the order ? 1-Yes 2-No");
        int place=cs.nextInt();
        if(place==1){
                e6.printOrderInfo();
        }else{
              System.out.println("thank you!");}
    }
    
}

