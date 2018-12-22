package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var total_ticket = scanner.nextInt()
    print("How many round-trip tickets:")
    var round_trip_ticket = scanner.nextInt()
    val info = BuyInfoKt(total_ticket, round_trip_ticket)
    info.print()
}

class BuyInfoKt(var total_ticket: Int, var round_trip_ticket: Int) {
    val ticket_price: Int = 1000
    fun print() {
        val total_price = ((total_ticket - round_trip_ticket) * ticket_price + round_trip_ticket.toDouble() * ticket_price.toDouble() * 2.0 * 0.9).toInt()
        println("Total tickets:" + total_ticket + "\n" +
                "Round-trip:" + round_trip_ticket + "\n" +
                "Total:" + total_price)
    }

}