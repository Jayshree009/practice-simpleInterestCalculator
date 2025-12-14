package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("This is a simple interest calculator");

        Scanner sc = new Scanner(System.in);
        //prompt user to enter principal amount
        System.out.println("Enter principal amount : \n");
        double principal = sc.nextDouble();

        //prompt user to enter ROI
        System.out.println("Enter the rate of interest : \n");
        double roi = sc.nextDouble();

        // prompt user to enter time in years
        System.out.println("Enter time years : \n");
        int years = sc.nextInt();


        // calculating simple interest using formula int = (P*R*T)/100
        double simpleInt = (principal*roi*years)/100;

        System.out.println(" Simple interest for "+principal+ " with "+roi+ " for "+years+ " years will be : "+simpleInt);

    }
}