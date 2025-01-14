package footDeliveryApplication.model;
public abstract class ItemMenu {
    protected String name;
    protected float price;
    protected String description;
    public ItemMenu(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void getDetails();
}
