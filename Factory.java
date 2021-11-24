public class Factory extends Inventory {
    // 1. Factory class is extending from Inventory class because it is an observer.
    //2.Does Product processing, shipping, Quality checking etc.
    //3.Factory interacts with the Menu class to add products to process, quality check, and ship.

    public void productProcessing(){
        System.out.println("Product processing method");
    }

    public void shipping(){
        System.out.println("Shipping method");
    }

    public void updateStock(){
        System.out.println("Quality check method");
    }

    private Factory factory = new Factory();

    Menu m1 = new Menu(); // m1 is used to access Menu; methods

    public Factory(){ // constructor
        super(); // this method is used to call the Inventory class variable and methods
    }


}
