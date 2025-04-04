package com.rockthejvm.playground.part1basics

object StringInterpolation {
  val aString = "Scala Rocks"

  // String methods  (from Java String)
  val length = aString.length
  val startsWithS = aString.startsWith("foo")
  val checkEmpty = aString.isEmpty
  val findIdx = aString.indexOf("x")

  // Specific to Scala - String interpolation.
  val name = "Alice"
  val age = 12
  val greeting_Java = "Hi, my name is " + name + " and I am " + age + " years old."
  val greeting_Scala = s"Hi, my name is $name and I am $age years old."  // "s-interpolated string"
  val greeting_v3 = s"Hi, my name is $name and I am $age years old and I will be turning ${age + 1} years old."

  def main(args: Array[String]): Unit = {
    println(greeting_Java)
    println(greeting_Scala)
    println(greeting_v3)
  }
}
