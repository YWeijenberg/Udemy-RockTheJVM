package lectures.part2oop

object OOBasics extends App {
    // Exercise 1
    private val John = new Writer(firstName = "John", surname = "Doe", yearOfBirth = 1974)
    private val theSpiderMan = new Novel(name="The Spider Man", yearOfRelease = 2005, author = John)
    println(theSpiderMan.authorAgeAtRelease)
    println(theSpiderMan.isWrittenBy(John))
    private val theSpiderManCopy = theSpiderMan.copy(2011)
    println(theSpiderManCopy.authorAgeAtRelease)

    // Exercise 2
    private val twenty = new Counter(20)
    private val twentyFive = twenty.increment(5)
    private val six = twentyFive.decrement(19)
    private val five = six.decrement
    private val seven = six.increment
    println(twenty.count)
    println(twentyFive.count)
    println(six.count)
    println(five.count)
    println(seven.count)
}
// Exercise 1
class Writer(firstName: String, surname: String, val yearOfBirth: Int) {
    def fullName(): String = {
        firstName + " " + surname
    }
}

class Novel(name: String, yearOfRelease: Int, author: Writer){
    def authorAgeAtRelease: Int = {
        yearOfRelease - author.yearOfBirth
    }

    def isWrittenBy(author: Writer): Boolean  = {author == this.author}

    def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)

}

// Exercise 2

class Counter(val count: Int) {
    def increment = new Counter(count + 1)
    def increment(n: Int): Counter = new Counter(count + n)
    def decrement = new Counter(count - 1)
    def decrement(n: Int): Counter = new Counter(count - n)

}