package org.example.basicconstructor

import org.example.enumandsealedclasses.Phone

class User (val nickname: String, val isSubscribed: Boolean = true) {
    fun main() {
        val alice = User("Alice")
        println(alice.isSubscribed)
        // true
        val bob = User("Bob", isSubscribed = false)
        println(bob.isSubscribed)
        // false
        val carlo = User("Carlo", false)
        println(carlo.isSubscribed)
        // false
    }
}