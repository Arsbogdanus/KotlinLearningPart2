package org.example.propertiesininterface

class FacebookUser(val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)

    fun getFacebookName (accountId: Int) : String {
        return accountId.toString();
    }
}