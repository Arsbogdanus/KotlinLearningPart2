package org.example.propertiesininterface

interface User {
    // val email: String
    val nickname: String
    //    get() = email.substringBefore('@')

    // Свойтсво не имеет поля для хранения
    // значения: результат вычисляется при
    // каждой поптке доступа
}