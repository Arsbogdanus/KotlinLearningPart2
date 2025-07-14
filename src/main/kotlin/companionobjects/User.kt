package org.example.companionobjects

/*
class User {
    val nickname: String

    constructor(email: String){
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int){
        nickname = facebookAccountId.toString()
    }
}*/


class User private constructor(val nickname: String){
    companion object{
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            User(accountId.toString())
    }
}
