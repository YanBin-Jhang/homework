package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var totalTicket = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundTripTicket = scanner.nextInt()
    val info = BuyInfoKt(totalTicket, roundTripTicket)
    info.print()
}

class BuyInfoKt(var totalTicket: Int, var roundTripTicket: Int) {
    val ticketPrice: Int = 1000
    fun print() {
        val total_price = ((totalTicket - roundTripTicket) * ticketPrice + roundTripTicket * ticketPrice * 2.0 * 0.9).toInt()
        println("Total tickets:" + totalTicket + "\n" +
                "Round-trip:" + roundTripTicket + "\n" +
                "Total:" + total_price)
    }

}