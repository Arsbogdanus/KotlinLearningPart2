package org.example.enumandsealedclasses

sealed class Phone {
    data class Smartphone(
        val brand: String,
        val model: String,
        val os: String
    ) : Phone()

    data class Landline(
        val brand: String,
        val hasCord: Boolean
    ) : Phone()

    object RotaryPhone : Phone()
}

// Функция, которая обрабатывает телефон
fun describePhone(phone: Phone): String = when (phone) {
    is Phone.Smartphone ->
        "Смартфон: ${phone.brand} ${phone.model} (ОС: ${phone.os})"
    is Phone.Landline ->
        "Стационарный телефон: ${phone.brand} (${if (phone.hasCord) "с проводом" else "беспроводной"})"
    Phone.RotaryPhone ->
        "Винтажный дисковый телефон!"
}

fun main() {
    val phones = listOf(
        Phone.Smartphone("Samsung", "Galaxy S25", "Android"),
        Phone.Landline("Panasonic", hasCord = true),
        Phone.RotaryPhone
    )

    phones.forEach { println(describePhone(it)) }
}