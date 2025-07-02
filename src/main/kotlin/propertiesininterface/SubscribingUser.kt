package org.example.propertiesininterface

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}