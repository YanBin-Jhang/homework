package com.box;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

        Box5 box5 = new Box5();
        Box3 box3 = new Box3();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter object's length:");
            float length = scanner.nextFloat();

            System.out.print("Please enter object's width:");
            float width = scanner.nextFloat();

            System.out.print("Please enter object's height:");
            int height = scanner.nextInt();

            if (box3.validate(length, width, height)) {
                System.out.println("Recommend: Box3");
            } else if (box5.validate(length, width, height)) {
                System.out.println("Recommend: Box5");
            } else {
                System.out.println("No box available");
            }
        } catch (InputMismatchException e) {
            System.out.println("[ERROR] Input error! Please input a number!");
        }
    }
}
