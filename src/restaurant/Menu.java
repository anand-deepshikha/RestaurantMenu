package restaurant;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    //private ArrayList<MenuItem> appetizers;
    //private ArrayList<MenuItem> mainCourse;
    //private ArrayList<MenuItem> desserts;
    //private boolean isNew;
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu()
    {
        menuItems=new ArrayList<>();
    }
    /*public MenuItem getItem() {
        return items;
    }

    public void setItems(MenuItem item) {
        this.item = item;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }*/
    public void addMenu(MenuItem item)
    {
        menuItems.add(item);
    }
    public void removeItem(int index)
    {
        menuItems.remove(index);
    }
    public MenuItem getItem(int index)
    {
        menuItems.get(index);
    }
    public void printAll()
    {
        System.out.println("Appetizers:");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="Appetizer")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
        }
        System.out.println("Main Course:-");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="main course")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
        }
        System.out.println("DESSERTS:");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="dessert")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
        }
    }

    public void printItem(int index)
    {
        MenuItem item=menuItems.get(index);
        System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
    }

   
}
