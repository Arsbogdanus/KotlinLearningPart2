package org.example.keywordobject.simpleimplementationofthesingletonpattern

import java.io.File

data class Person(val name: String) {
    object NameComparator : Comparator<Person>{
        override fun compare(p1: Person, p2: Person): Int {
            return p1.name.compareTo(p2.name)
        }
    }
}