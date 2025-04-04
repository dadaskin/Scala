package com.rockthejvm.playground.part1basics

object Functions {

  // Function: a reusable piece of code that you can parameterize
  def aFunction(a: String, b: Int): String =
    // Always a single instruction
    a + " " + b

  // Invocation
  val anInvocation = aFunction("Scala", 999)

  // Functions returning Unit (equiv to void in Java)
  def aVoidFunction(aString: String): Unit =
    println(aString)

  def functionWithSideEffects(aString: String): String = {
    println(aString)     // side effect
    aString + "  " + aString  // This expressions is returned
  }

  // Can define smaller function inside bigger ones
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n + 1)
  }

  def main(args: Array[String]): Unit = {
    println(aBigFunction(10))
  }
}