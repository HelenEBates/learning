package com.models;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Window> windows;
    private List<Door> doors;

    public House() {
        this.windows = new ArrayList<>();
        this.doors = new ArrayList<>();
    }

    public void addWindow(Window window) {
        this.windows.add(window);
    }

    public void addDoor(Door door) {
        this.doors.add(door);
    }

    public int getCost() {
        int cost = 0;

        for (int i = 0; i < this.windows.size(); i++) {
            cost = cost + this.windows.get(i).getCost();
            // cost += this.windows.get(i).getCost();
        }
//
//        for(Window window : this.windows) {
//            cost = cost + window.getCost();
//        }
//

        for (int i = 0; i < this.doors.size(); i++) {
            cost = cost + this.doors.get(i).getCost();
            // cost += this.windows.get(i).getCost();
        }

        return cost;
    }

}
