package week1_renew;

import week1_renew.CartItem;

import java.util.* ;


public class ShoppingCart {
    // 1. Identifier: A list that holds multiple CartItem objects
   private List<CartItem> items;

    // 2. Constructor (Starts with an empty list)
   public ShoppingCart(){
       this.items = new ArrayList<>();
   }


   //3.Business logic Methods
    public void addItem(Product product, int quantity){
       //Creating a new cart item linking product and quantity
        CartItem newItem = new CartItem(product, quantity);
        items.add(newItem);
        System.out.println(quantity + "x " + product.getName() + " added to cart.");
    }


    public double calculateCartTotal(){
       double grandTotal = 0.0;
       //looping through Cart items each item
        for(CartItem item : items){
            grandTotal += item.getTotalItemPrice();
        }

        return grandTotal;
    }
}
