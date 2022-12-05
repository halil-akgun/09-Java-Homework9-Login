package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, reset, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("username: ");
        userName = inp.nextLine();
        System.out.print("password: ");
        password = inp.nextLine();

        if (!(userName.equals("patika"))) {
            System.out.println("username is incorrect.");
        } else if (password.equals("java123")) {
            System.out.println("you are logged in.");
        } else {
            System.out.println("password is incorrect.");
            System.out.print("reset your password? input Y or N.  (Y-->Yes   N-->No) : ");
            reset = inp.nextLine();
            if (reset.equals("Y")) {
                System.out.print("your new password: ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Could not change password, please enter another password.");
                } else {
                    password = newPassword;
                    System.out.println("The password was changed.");
                    System.out.println("your new password: " + password);
                }
            } else if (reset.equals("N")) {

            } else {
                System.out.println("incorrect entry");
            }
        }

    }
}