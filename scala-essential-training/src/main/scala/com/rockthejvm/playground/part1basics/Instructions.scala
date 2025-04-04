package com.rockthejvm.playground.part1basics

object Instructions {

  // Instructions vs expressions:
  // Imperative programming: do this, to that, repeat, etc.
  // Functional programming: expressions that evaluate to a value.

  // In Scala an "instruction" is a structure (expression) that returns Unit
  val printing: Unit = println("This is an instruction")  // Printing is the side effect.
  val theUnit: Unit = ()   // The only possible value of type Unit.

  // Instructions - code blocks returning Unit
  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  // Variables can be reassigned
  var aVariable = 10   // Keyword is "var" not "val"
  aVariable = 34

  val reassignment: Unit = aVariable +=1  // The act of reassignment produces unit.

  def main(args: Array[String]): Unit = {
    // Loops
    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }
  }
}
