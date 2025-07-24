package org.example.lambdaexpressionsandcollections

fun findTheOldest(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people){
        if (person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)

    people.maxBy { it.age }            // Найдет элемент коллекции с максимальным значеним свойства age
}