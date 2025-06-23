package org.example.interfacesInKotlin

interface Clickable {
    fun click()               // Обычное объявление метода
    fun showOff() = println("I'm clickable!")       // Метод с реализацией по умолчанию
}