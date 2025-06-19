package org.example.localfunctionsandextensions

class User(val id: Int, val name: String, val address: String) {

    /*fun saveUser(user: User) {
        fun validate(
            user: User,                     // Объявление локальной функции для проверки произвольного поля
            value: String,
            fieldName: String
        ) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                    "Can't save user ${user.id}: empty $fieldName"
                )
            }
        }
        validate(user, user.name, "Name")               // Вызов функции для проверки конкретных полей
        validate(user, user.address, "Address")
    }*/


    /*fun saveUser(user: User) {

        fun validate(value: String, fieldName: String) {            // Теперь не нужно дублировать параметра user  в функции saveUser
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                    "Can't save user ${user.id}: " +                // Можно напрямую обращаться к параметрам внешней функции
                            "empty $fieldName")
            }
        }

        validate(user.name, "Name")
        validate(user.address, "Address")
    }*/

    fun User.validateBeforeSave() {
        fun validate(value: String, fieldName: String) {
            if (value.isEmpty()) {
                throw IllegalArgumentException(
                    "Can't save user $id: empty $fieldName")            // К свойствам класса User можно обращатсья напрямую
            }
        }
        validate(name, "Name")
        validate(address, "Address")
    }

    fun saveUser(user: User) {
        user.validateBeforeSave()                                       // Вызов функции-расширения
    }
}