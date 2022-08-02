package menu;

import java.util.Date;


public class MenuItem {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        this.isNew = isNew;
    }
    public String toString() {
        return "-------------------------------------------- \n" +  name  + "\n" + description + "\n" + price + "\n";
    }
}
