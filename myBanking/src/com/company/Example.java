package com.company;

public class Example {

    //properties
    private String name;

    // constructor
    public Example(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;

    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //Operation
    public void clearName() {
        this.name = null;
    }

    //Operation
    public void outputName() {
        System.out.println(this.name);
    }
}
