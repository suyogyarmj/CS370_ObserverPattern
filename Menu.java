// 1. [If we can figure this out!!] This also displays price(s)
// --> [old price, updated price after coupon].
// ***sellers can not use any coupon, so they have one price. ?
// [Yet to be completed]
// 2. There will two kinds of price --> Seller's price and Customer's price. ?
// [Yet to be completed]
//3. Menu class interacts with the Inventory class to know if a
// product is in stock or not. [Yet to be completed]
//4. Display the product names.

public class Menu {

    private float oldPrice;
    private float priceAfterCoupon;

    private float sellerPrice;
    private float customerPrice;

    private Menu menu = new Menu();
    public void updateStock(){
        System.out.println("Stock is being updated");
    }

    public void displayProducts(){
        System.out.println("Display Product name");
    }



}
