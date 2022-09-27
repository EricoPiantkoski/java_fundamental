package com.br.collections.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);

        System.out.println("insert the quantity of notes");
        int len = init.nextInt();

        double[] notes = new double[len];
        for (double note:notes){
            System.out.println("insert the "+ ArrayUtils.indexOf(notes, note)+"o note");
            notes[ArrayUtils.indexOf(notes, note)] = init.nextDouble();
        }

        double average = 0;
        for (double note: notes){
            average += note;
        }

        System.out.println(average/len);

        init.close();
    }
}