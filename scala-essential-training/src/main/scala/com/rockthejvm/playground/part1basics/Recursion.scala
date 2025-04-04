package com.rockthejvm.playground.part1basics

object Recursion {

  // Recursion - simulates repetition in functional programming

  // Sum of integers up to n
  def sum(n: Int): Int =
    if (n <= 0) 0
    else n + sum(n-1)

  // Thinking in recursion
  def printN(string: String, n: Int): Unit =
    if (n <=0 ) ()
    else {
      println(string)
      printN(string, n-1)
    }

  /*
    IsPrime(7) =
      testDivisors(2) =
      testDivisors(3) =
      testDivisors(4) =  true => true
   */

  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d+1)

    if (n <= 0) false
    else if (n == 1) false
    else testDivisors(2)
  }

  /*
  * Exercises
  * 1. Concatenate a string a set number of times
  * 2. Calculate nth Fibonocci number
  */

  def concatenate(string: String, n: Int): String =
    if (n <= 0) ""
    else string + concatenate(string, n-1)

  def fib(n: Int): Int =
    if (n <= 1) 1
    else if (n == 2) 2
    else fib(n-1) + fib (n-2)


  def main(args: Array[String]): Unit = {
     println(concatenate("a ", 5))  /* a a a a a */
     println(fib(6))  /* 13 */
  }
}
