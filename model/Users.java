package footDeliveryApplication.model;
import java.util.List;
public class Users {
    private int userId;
    private String userName;
    private List<Order> orderHistory;

    public Users(int userId, String userName, List<Order> orderHistory) {
        this.userId = userId;
        this.userName = userName;
        this.orderHistory = orderHistory;
    }
    public void placeOrder(Order order){
        orderHistory.add(order);
    }
    public void viewOrdeHistory(){
        System.out.println("Order History of ["+userName+"]");
        for (Order order : orderHistory){
            order.displayOrder();
        }
    }
}
