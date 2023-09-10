package part1basics

import scala.annotation.tailrec

object Recursion extends App {
  
    // 2. 
    def isPrime(n: Int): Boolean = {
        @tailrec
        def isPrimeUntil(t: Int, state: Boolean): Boolean = {
            if (!state) false
            else if(t <= 1) state
            else isPrimeUntil(t-1, n%t !=0 && state)
        }
        isPrimeUntil(n/2,true)
    }

    println(isPrime(100))

    //3

    def fibonacci(n: Int): Int ={
        @tailrec
        def fibonacciHelper(i: Int, last: Int, nextToLast: Int): Int = {
            if (i>=n) last
            else fibonacciHelper(i+1,last+nextToLast,last)
        }
        if (n<=2) 1
        else fibonacciHelper(2,1,1)
    }

    println(fibonacci(6))



}
