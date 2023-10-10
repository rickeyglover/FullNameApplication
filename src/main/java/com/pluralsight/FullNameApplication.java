package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your Full Name");
        System.out.println("First Name: ");
        String fname = myScanner.nextLine();

        System.out.println("Middle Name: ");
        String mname = myScanner.nextLine();
        int space = mname.length();
        if (space > 0)
        { mname = mname + " ";}

        else if (space == 0)
        {mname = ("");}

        System.out.println("Last Name: ");
        String lname = myScanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = myScanner.nextLine();
        int length = suffix.length();
        if (length > 0)
        { lname = lname + ", "; }

        else if (length == 0)
        {lname = " "+ lname;}



        System.out.println("Full name:" + fname + " " + mname + lname + suffix);

    }
}
