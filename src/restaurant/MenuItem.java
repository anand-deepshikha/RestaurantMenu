package restaurant;

public class MenuItem {

    String itemName;
    float price;
    String description;
    String category;
    boolean isNew=false;

    public MenuItem(String itemName, float price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category=category;

    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


}
