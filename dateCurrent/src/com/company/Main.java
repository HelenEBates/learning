package com.company;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dateScan = new Scanner(System.in);
        System.out.println("Enter date ");
        String enterDate =dateScan.nextLine();
        // DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat df = new SimpleDateFormat("E/MMMM/yyyy HH:mm:ss");
        //Date dateobj = new Date();
        //System.out.println(df.format(dateobj));
    }
}
