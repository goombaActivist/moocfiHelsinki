package moocfihelsinki.items;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import moocfihelsinki.item.Item;

public class Items {
    private static Scanner readInput = new Scanner(System.in);
    private ArrayList<Item> currItems = new ArrayList<>();
    static final LocalDate CURDATE = LocalDate.now();

    public void printItems(){
        this.currItems.forEach((curItem) -> {
        System.out.println("Name: " + curItem.name.toString());
        System.out.println("created at: " + curItem.creationDate.toString());
        });
    }

    public void addItem(){
        System.out.println("Item name: ");
        var itemName = readInput.nextLine();
        var curItem = new Item(itemName, CURDATE);
        this.currItems.add(curItem);
    }
}
