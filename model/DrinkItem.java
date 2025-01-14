package footDeliveryApplication.model;

public class DrinkItem extends ItemMenu{
    private String size;
    public DrinkItem(String name, float price, String description , String size) {
        super(name, price, description);
        this.size = size;
    }
    @Override
    public void getDetails() {
        System.out.println("Drink Name : "+name);
        System.out.println("Drink Price :"+price);
        System.out.println("Drink Description : "+description);
        System.out.println("Drink Size : "+size);
    }
}
