public class Order {
    private MenuItem item1, item2, item3;
    private double totalAmount;

    // Methods to add Items to Order
    public void addItem1(MenuItem item1) {
        this.item1 = item1;
    }
    public void addItem2(MenuItem item2) {
        this.item2 = item2;
    }
    public void addItem3(MenuItem item3) {
        this.item3 = item3;
    }

    // Method to calculate total cost
    public void calculateTotal() {
        totalAmount = 0;

        if (item1 != null) totalAmount += item1.getPrice(); // check if empty
        if (item2 != null) totalAmount += item2.getPrice();
        if (item3 != null) totalAmount += item3.getPrice();
    }

    // Method to display Order
    public void displayOrderDetails() {
        System.out.println("|| Order ||");

        if (item1 != null) item1.displayItemInfo(); // check if empty
        if (item2 != null) item2.displayItemInfo();
        if (item3 != null) item3.displayItemInfo();

        System.out.println("Total: $" + totalAmount);
    }
}
