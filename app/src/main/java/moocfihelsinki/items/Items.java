package main.java.moocfihelsinki.items;

import java.util.ArrayList;
import java.util.Scanner;

public class Item{
    protected String name;
    protected Date creationDate;

    protected Item(String itemName, Date cdate){
        this.name = itemName;
        this.creationDate = cdate;
    }
}

public class Items {
    private static Scanner readInput;
    private ArrayList<Item> currItems;

    public void printItems(){
        this.currItems.forEach((curItem) -> {
        System.out.println("Name: " + curItem.name.toString());
        System.out.println("created at: " + curItem.creationDate.toString());
        });
    }

    public void addItem(){
        var itemName = System.out.println("Item name: ");
        readInput.nextLine();
        System.out.println("Date of creation ");
        var cdate = readInput.nextLine();
        this.currItems.add(Item(itemName,cdate));
    }
}
