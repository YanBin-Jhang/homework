package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicket = 0;
        while (totalTicket != -1) {
            System.out.println("If you want to quit, please enter -1");
            System.out.print("Please enter number of tickets:");
            totalTicket = scanner.nextInt();
            if (totalTicket == -1) {
                System.out.println("Good Bye");
                break;
            } else {
                System.out.print("How many round-trip tickets:");
                int roundTripTicket = scanner.nextInt();
                BuyInfo info = new BuyInfo(totalTicket, roundTripTicket);
                info.print();
            }
        }
    }
}
