package week1_renew;

public class Main {

    public static void main(String[] args){

        // Adding Products
           Product PeanutButter = new Product("PB Butter", 6.99, "101");
           Product Fruit = new Product("Gala Apple 3 lb", 3.99, "102");
           Product Meat= new Product("16 pack Chicken Thighs", 9.99, "103");
        // Creating my Cart to add items in it.
           ShoppingCart myCart = new ShoppingCart();

           // using methods we created [add items]

           myCart.addItem(PeanutButter, 1);
           myCart.addItem(Meat, 4);


        double finalPrice = myCart.calculateCartTotal();

        System.out.println("--------------------------------");
        System.out.println("Your total checkout bill is: $" + finalPrice);


       }




}
