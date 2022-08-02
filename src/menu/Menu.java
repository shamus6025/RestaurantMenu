package menu;

import java.util.Collections;
import menu.MenuItem;
import java.util.Map;
import java.util.HashMap;

public class Menu {
    public static void main(String[] args) {
        MenuItem cheeseBurger = new MenuItem("Cheese Burger",4.99,"Grilled Beef Patty with Melted Cheese on a Sesame Bun","Sandwiches",Boolean.TRUE);


        System.out.println(cheeseBurger.toString());
    }
}
