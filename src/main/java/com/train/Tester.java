package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int totalTicket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int roundTripTicket = scanner.nextInt();
        BuyInfo info = new BuyInfo(totalTicket, roundTripTicket);
        info.print();

    }
}
