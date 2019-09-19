package com.company;

public class Flight {
    private int passengers;
    private int seats;

    Flight() {
        seats = 150;
        passengers = 0;
    }

    void add1Passenger() {
        if (passengers < seats)
            passengers += 1;

        else
            return;
        System.out.println("Flight is fully booked");
    }
/*
    void handleTooMany() {
        System.out.println("Too many passengers");
    }

    public boolean hasRoom(Flight) {
        int total = passengers + f2.passengers;
        return total <= seats;

    } */


}
