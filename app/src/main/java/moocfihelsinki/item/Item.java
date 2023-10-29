package moocfihelsinki.item;

import java.time.LocalDate;

public class Item{
    public String name;
    public LocalDate creationDate;

    public Item(String itemName, LocalDate cdate){
        this.name = itemName;
        this.creationDate = cdate;
    }
}

