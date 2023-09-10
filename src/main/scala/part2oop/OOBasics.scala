package part2oop

object OOBasics extends App {
  
    val person = new Person("John",26)
    println(person.age)
}

class Person(name: String, age: Int)