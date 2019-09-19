package com.company;

import java.io.*;
import java.util.Scanner;

public class readInaFile {

    public static void read() {
        File fileOfCustomers = new File("/Users/helenb/Downloads/walmart-master/data/customer_info.csv");


        Scanner sc = null;
        try {
            sc = new Scanner(fileOfCustomers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
        //BufferedInputStream input = null;
        //FileInputStream fileinput = null;

   /* FileReader fr = new FileReader("C://Users//helenb//Downloads//walmart-master//data//customer_info.csv");
    int i;
    while((i = fr.read()) != -1)
        System.out.print(char)i); */

    }

}
