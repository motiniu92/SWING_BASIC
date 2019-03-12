package com.coderbd.evidence1;

import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Email for check:");

        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2 && dotpos < email.length()) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
