package footDeliveryApplication.view;

import footDeliveryApplication.model.Order;

import java.util.List;

public class OrderView {
        public void displayOrderDetails(Order order) {
            order.displayOrder();
    }
    public void displayOrderHistory(List<Order> orderHistory) {
        for (Order order : orderHistory) {
            order.displayOrder();
        }
    }
}
