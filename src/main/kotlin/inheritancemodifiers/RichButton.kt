package org.example.inheritancemodifiers

import org.example.interfacesInKotlin.Clickable

open class RichButton : Clickable {         // Это открытый класс: другие могут наслдеовать его
    fun disable() {}                         // Это закрытая функция: её невозможно переопределить в подклассе
    open fun animate() {}                    // Это открытая функция: её можно переопределить в подклассе

    /* override fun click() {                  // Переопределение открытой функции также является открытым
     }*/
    final override fun click() {}            // Ключевое слово "final" здесь не лишнее, потому что модификатор "override" без "final" означает, что метод останется открытым
}