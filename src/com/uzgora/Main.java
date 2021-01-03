package com.uzgora;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myName = "Heyy";
        LocalDate todayDate = LocalDate.now();
        int [] myArray = new int[21];
        myArray[2] = 3;
        for (int i=0 ; i<2 ; i++){
            if( i%2 ==0){
                System.out.println("The day is" + " :" + todayDate);
                System.out.println(myArray[2]);
            }else {
                System.out.println("Ahmettt" + " " + myName.toUpperCase());
            }
        }
        System.out.println("Hello World");
    }
}
