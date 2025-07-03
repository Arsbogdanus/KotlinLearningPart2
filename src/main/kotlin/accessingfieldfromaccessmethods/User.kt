package org.example.accessingfieldfromaccessmethods

class User(val name: String) {
    var address: String = "unspecified"
        set (value: String) {
            println("""
            Address was changed for $name:    
            "$field" -> "$value.""".trimIndent())  // Чтение значения из поля
            field = value // Изменение значения поля
        }
}