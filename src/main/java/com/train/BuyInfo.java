package com.train;

public class BuyInfo {
    int ticket_price = 1000;
    int total_ticket;
    int round_trip_ticket;

    public BuyInfo(int total_ticket, int round_trip_ticket) {
        this.total_ticket = total_ticket;
        this.round_trip_ticket = round_trip_ticket;
    }

    public void print() {
        int total_price = (int) ((total_ticket - round_trip_ticket) * ticket_price + (round_trip_ticket * ticket_price * 2 * 0.9));
        System.out.println("Total tickets:" + total_ticket + "\n" +
                "Round-trip:" + round_trip_ticket + "\n" +
                "Total:" + total_price);
    }
}
