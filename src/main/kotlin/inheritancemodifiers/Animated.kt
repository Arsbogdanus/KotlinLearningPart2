package org.example.inheritancemodifiers

abstract class Animated {           // Это абстрактный класс: нельзя создать его экземпляр
    abstract fun animate()          // Это абстрактная функция: она не имеет реализации и должна быть переопределена в подклассах
    open fun stopAnimating(){
    }
                                    // Конкретные функции в абстрактных классах
                                    // по умолчанию закрыты, но их можна сделать открытыми
    fun animateTwice(){
    }
}