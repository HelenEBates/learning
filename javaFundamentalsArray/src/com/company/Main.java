package com.company;

public class Main {

    public static void main(String[] args) {
	float[] values = new float[5];
	values[0] = 10.0f;
	values[1] = 20.0f;
	values[2] = 30.0f;
	values[3] = 40.0f;
	values[4] = 50.0f;


	float sum = 0.0f;

	/*for (int i = 0; i <values.length; i++)
	    sum += values[i]; */
    for (float currentValue : values)
    	sum += currentValue;

	System.out.println(sum);
    }
}
