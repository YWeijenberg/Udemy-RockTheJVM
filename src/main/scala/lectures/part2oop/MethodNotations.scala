package lectures.part2oop

import scala.language.postfixOps

object  MethodNotations extends App {
  val mary = new Person(name="Mary", age=20, favoriteMovie="Inception")
  println(mary learnsScala)
  mary(20)
}

class Person(val name: String, favoriteMovie: String, age: Int = 0) {
  def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  def +(nickName: String): Person = new Person(name = s"$this.name ($nickName)", favoriteMovie, age)
  def unary_+ (): Person = new Person(name, favoriteMovie, age = age+1)
  def learns(subject: String): String = s"$name learns $subject"
  def learnsScala: String = learns("Scala")

  def apply(n: Int): Unit = println(s"$name watched $favoriteMovie $n times!")

}

