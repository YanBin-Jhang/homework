package com.train;

public class BuyInfo {
    int ticketPrice = 1000;
    int totalTicket;
    int roundTripTicket;

    public BuyInfo(int totalTicket, int roundTripTicket) {
        this.totalTicket = totalTicket;
        this.roundTripTicket = roundTripTicket;
    }

    public void print() {
        int totalPrice = (int) ((totalTicket - roundTripTicket) * ticketPrice + (roundTripTicket * ticketPrice * 2 * 0.9));
        System.out.println("Total tickets:" + totalPrice + "\n" +
                "Round-trip:" + totalPrice + "\n" +
                "Total:" + totalPrice);
    }
}
