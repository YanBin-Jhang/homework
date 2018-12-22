package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int total_ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int round_trip_ticket = scanner.nextInt();
        BuyInfo info = new BuyInfo(total_ticket, round_trip_ticket);
        info.print();

    }
}
