package footDeliveryApplication.view;

import footDeliveryApplication.model.ItemMenu;
import footDeliveryApplication.model.Order;

import java.awt.*;
import java.util.List;

public class MenuView {
    public void displayMenu(List<ItemMenu> menu){
        System.out.println("==============Menu================");
        for(ItemMenu menus : menu){
            menus.getDetails();
        }
    }
}


