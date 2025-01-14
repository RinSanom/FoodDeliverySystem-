package footDeliveryApplication.model;

import java.util.List;

public class Restaurant {
    protected List<ItemMenu> menus;
    protected List<Order> orders;
    public Restaurant(List<ItemMenu> menus, List<Order> orders) {
        this.menus = menus;
        this.orders = orders;
    }
    public void addToMenu(ItemMenu itemMenu){
        menus.add(itemMenu);
    }
    public void viewMenu(){
        System.out.println("menus");
        for(ItemMenu items : menus){
            items.getDetails();
        }
    }
    public void processOrder(Order order){
        order.updateStatus("Preparing");
        System.out.println("Order " + order + " is now being prepared.");
    }
}
