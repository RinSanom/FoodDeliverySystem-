package footDeliveryApplication.model;

import java.util.List;

public class Fooditem extends ItemMenu{
    private List<String> ingredients;

    public Fooditem(String name, float price, String description , List<String>ingredients) {
        super(name, price, description);
        this.ingredients = ingredients;
    }
    @Override
    public void getDetails() {
        System.out.println("Food Name  : "+name);
        System.out.println("Food price : "+price);
        System.out.println("Food Decription : "+description);
        for (String ingredients : ingredients){
            System.out.println("food Ingredients: "+ingredients);
        }
        System.out.println();
    }
}
