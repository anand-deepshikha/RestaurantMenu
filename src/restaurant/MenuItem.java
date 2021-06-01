package restaurant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class MenuItem {

    String itemName;
    float price;
    String description;
    String category;
    private LocalDate addedOn;




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

    public LocalDate getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDate addedOn) {
        this.addedOn = addedOn;
    }

    public boolean isNew() {
        return LocalDate.now().compareTo(addedOn.plusDays(30))<0;

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemName, menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }

    @Override
    public String toString() {
        return "ItemName='" + itemName + '\'' +
                ", Price=" + price +
                ", Description='" + description + '\'' +
                ", Category='" + category + '\'' +
                ","+(isNew()? "New":' ');
    }
}
