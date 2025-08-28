public class Cafe {
    private MenuItem menuItem1, menuItem2, menuItem3;
    private Order currentOrder;

    // Methods to add items to menu
    public void addMenuItem1(MenuItem item) {
        menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item) {
        menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item) {
        menuItem3 = item;
    }

    // Method to place order
    public void placeOrder(Order order) {
        currentOrder = order;
        currentOrder.calculateTotal();
    }

    // Method to display menu
    public void displayMenu() {
        System.out.println("|| Menu ||");
        if (menuItem1 != null) menuItem1.displayItemInfo(); // check if empty
        if (menuItem2 != null) menuItem2.displayItemInfo();
        if (menuItem3 != null) menuItem3.displayItemInfo();
    }
}
