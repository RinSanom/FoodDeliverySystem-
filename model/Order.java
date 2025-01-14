package footDeliveryApplication.model;
import java.util.List;
public class Order {
    protected int orderId;
    public List<ItemMenu> items;
    protected String status;
    public Order(int orderId, List<ItemMenu> items, String status) {
        this.orderId = orderId;
        this.items = items;
        this.status = status;
    }
    public void addItem(ItemMenu itemMenu){

        items.add(itemMenu);
    }
    public void removeItem(ItemMenu itemMenu){
        items.remove(itemMenu);
    }
    public float calculateTotal(){
        float total=0;
        for (ItemMenu item :items ){
            total += item.price;
        }
        return(total);
    }
    public void updateStatus(String newStarus){
        this.status = newStarus;
    }
    public void displayOrder(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
        System.out.println("Items:");
        for(ItemMenu item : items){
            item.getDetails();
        }
        System.out.println("Total: $" + calculateTotal());
    }
}
