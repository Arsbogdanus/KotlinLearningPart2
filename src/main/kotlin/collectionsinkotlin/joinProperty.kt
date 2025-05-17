package org.example.collectionsinkotlin

val String.lastChar: Char get() = get(length - 1)

var StringBuilder.latChar: Char
    get() = get(length - 1)                     // Метод чтения для свойства
    set(value: Char){
        this.setCharAt(length - 1, value)   // Метод записи для свойства
    }