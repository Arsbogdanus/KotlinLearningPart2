@file:JvmName("Blablabla")          // Аннотация для объявления имени класса

package org.example.collectionsinkotlin

import java.awt.Button
import javax.swing.text.View

// Выражение package следует за аннотациями уровня файла

fun <T> Collection<T>.joinToString(                 // Объявляем функции-расширения для типа Collection<T>
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {        // "this" ссылается на объект-приемник коллекцию элементов типа T
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

var opCount = 0                 // Объявление свойства верхнего уровня

fun performOperation() {
    opCount++                   // Изменение значения свойства
}

fun reportOperationCount() {
    println("Operation performed $opCount times")       // Чтение значения свойства
}

const val UNIX_LINE_SEPARATOR = "\n"
// public static final String UNIX_LINE_SEPARATOR = "\n";