package com.company;

import com.models.Door;
import com.models.House;
import com.models.Window;

public class Main {

    public static void main(String[] args) {
        House house = new House();
        Window window = new Window(5);

        house.addWindow(window);
        house.addDoor(new Door(10));


        int cost = house.getCost();

        System.out.println("The cost of my house is: " + cost);

    }
}
