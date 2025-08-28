public class Main {
    public static void main(String[] args) {

        // Creates menu items
        MenuItem lemonade = new MenuItem("Lemonade", 3.49, "Beverage");
        MenuItem burger = new MenuItem("Burger", 6.99, "Entree");
        MenuItem cheeseCake = new MenuItem("Cheese Cake", 4.99, "Desert");

        // Creates menu for cafe
        Cafe cafe = new Cafe();
        cafe.addMenuItem1(lemonade);
        cafe.addMenuItem2(burger);
        cafe.addMenuItem3(cheeseCake);
        cafe.displayMenu();

        // Creates order
        Order order = new Order();
        order.addItem1(lemonade);
        order.addItem3(cheeseCake);
        cafe.placeOrder(order);
        order.displayOrderDetails();
    }
}