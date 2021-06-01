package restaurant;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    private MenuItem[] menuItems;
    public LocalDate lastUpdated()
    {
        LocalDate lastUpdatedOn=null;
        for(MenuItem item:menuItems)
        {
            if(lastUpdatedOn==null) lastUpdatedOn=item.getAddedOn();
            else if(lastUpdatedOn.compareTo(item.getAddedOn())<0)
                lastUpdatedOn=item.getAddedOn();
        }
        return  lastUpdatedOn;
    }

    public Menu()
    {
        menuItems=new MenuItem[0];
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenu(MenuItem item)
    {
        MenuItem [] currentMenu=new MenuItem[menuItems.length+1];
        for(int i=0;i<menuItems.length;i++)
            currentMenu[i]=menuItems[i];
        currentMenu[currentMenu.length-1]=item;
        menuItems=currentMenu;

    }
    public void removeItem(MenuItem item)
    {
       int newSize=0;
       for(int i=0;i<menuItems.length;i++)
       {
           if(menuItems[i].equals(item))
               menuItems[i]=null;
           else
               newSize++;
       }

       int index=0;
       MenuItem [] currentMenu=new MenuItem[newSize];
       for(MenuItem element:menuItems)
       {
           if(element!=null) {
               currentMenu[index] = element;
               index++;
           }
       }
       menuItems=currentMenu;
    }

    public void printAll()
    {
        System.out.println("Appetizers:");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="Appetizer")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
            System.out.println("Last Updated:"+lastUpdated());
        }
        System.out.println("Main Course:-");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="main course")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
            System.out.println("Last Updated:"+lastUpdated());
        }
        System.out.println("DESSERTS:");
        for(MenuItem item:menuItems)
        {
            if(item.getCategory()=="dessert")
                System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
            System.out.println("Last Updated:"+lastUpdated());
        }

    }

    public void printItem(int index)
    {
        MenuItem item=menuItems[index];
        System.out.println(item.getItemName()+"\n"+item.getDescription()+"\n"+item.getPrice());
    }


}
