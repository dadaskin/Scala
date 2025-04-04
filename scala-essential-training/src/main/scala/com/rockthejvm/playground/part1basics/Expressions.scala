package com.rockthejvm.playground.part1basics

object Expressions {

  // Structures that evaluate to a value
  val meaningOfLife = 40  + 2
  //                  ^^^^^^^  expression

  // Expressions that compose: + - * /  [bitwise: & | << >>]
  val mathExp = 2 + 3 * 4  // 14

  // Boolean expressions:
  val equalityTest = 1 == 2 // Returns true/false  (all the usual operators)

  // if expressions  various syntaxes
  val anIfExp1 = if (equalityTest) 45 else 99
  val anIfExp2 = if equalityTest then 45 else 99

  // code blocks are expressions
  //   Can paste entire contents between {} (including {}) into println to test
  //   if it is an expression.
  val aCodeBlock1 = {
    // define local values
    val localValue = 78
    // ...
    // last value is the value of the ENTIRE BLOCK
    localValue + 99
  }

  // Indentation syntax   ({} syntax is better)
  val aCodeBlock2 =
    val localValue = 78    // indent of this line matters
    localValue + 99        // indent of this line matters

  // Pattern matching - enhanced "switch"
  val someValue = 42.00001
  val description = someValue match {
    case 1 => "The first"        // "=>" is called "Thick Arrow"
    case 2 => "second"
    case 42 => "meaning of Life"
    case _ =>  "something else"   // '_' is the default case
  }

  def main(args: Array[String]): Unit = {
    println(description)
  }
}
