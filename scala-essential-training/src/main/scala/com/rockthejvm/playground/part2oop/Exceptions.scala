package com.rockthejvm.playground.part2oop

object Exceptions {

  /**
   * Hierarchy
   *   Throwable
   *     Error (JVM-related crashes)
   *       OutOfMemory
   *       StackOverflow
   *       ...
   *     Exception (user-facing crashes)
   *       RuntimeException
   *        (Custom)
   */

    class MyException extends RuntimeException("Too big")


  def sumN(n: Int): Int =
    if (n < 0) throw new IllegalArgumentException("Negative number unsupported.")
    else if (n >= 50000) throw new MyException
    else if (n <= 0) 0
    else n + sumN(n-1)

  // try/catch
  val attempt = try {
    println(sumN(55555))
  } catch {
    case e: IllegalArgumentException => -1
    case e: MyException => Int.MaxValue
  }

  // Alternative syntax w/o braces
  val attempt2 =
    try
      println(sumN(55555))
    catch
      case e: IllegalArgumentException => -1
      case e: RuntimeException => Int.MaxValue


  def main(args: Array[String]): Unit = {
    println(attempt)
    println(attempt2)
  }
}