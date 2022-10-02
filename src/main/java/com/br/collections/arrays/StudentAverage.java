package com.br.collections.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);

        System.out.println("insert the quantity of notes");
        int len = init.nextInt();
        double average = 0;

        double[] notes = new double[len];
        for (double note:notes){
            int index = ArrayUtils.indexOf(notes, note);
            System.out.println("insert the "+ (index+1) +"o note");
            notes[index] = init.nextDouble();
            average += notes[index];
        }

        System.out.println(average/len);

        init.close();
    }
}