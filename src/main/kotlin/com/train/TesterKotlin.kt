package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var totalTicket = 0;
    while (totalTicket != -1) {
        println("If you want to quit, please enter -1")
        print("Please enter number of tickets:")
        totalTicket = scanner.nextInt()
        if (totalTicket != -1) {
            print("How many round-trip tickets:")
            var roundTripTicket = scanner.nextInt()
            val info = BuyInfoKt(totalTicket, roundTripTicket)
            info.print()
        } else {
            println("Good Bye")
        }
    }
}

class BuyInfoKt(var totalTicket: Int, var roundTripTicket: Int) {
    val ticketPrice: Int = 1000
    fun print() {
        val total_price = calculate()
        println("Total tickets: $totalTicket\n" +
                "Round-trip: $roundTripTicket\n" +
                "Total: $total_price\n")
    }

    fun calculate() = ((totalTicket - roundTripTicket) * ticketPrice + roundTripTicket * ticketPrice * 2.0 * 0.9).toInt()

}