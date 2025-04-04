package com.rockthejvm.playground.part2oop

object MethodNotation {

  class Person(val name: String) {
    def greet(another: Person): String =
      s"$name says Hi, ${another.name}..."

    // "infix" is an optional keyword to alert other developers that infix notation will work on this method
    infix def likes(movie: String): String = s"$name says: Thumbs up on $movie"
    // ... but compiler doesn't flag the problem if placed on method with 2 args.
    // However, it will be flagged when you try to invoke it.
    infix def foo(a: Int, b:Int): Int = { a+b }

    // Scala allows some non-alphanumeric method names:  "Method permissiveness"
    infix def ?!(another: Person): String =
      s"$name says: WTF ${another.name}?"

    // Special method called "apply" can be invoked on an instance of classes on arguments as if it were a function.
    // This is useful in Functional Programming
    def apply(progLang:String): Unit =
      println(s"[$name] Programming in $progLang")

    def apply(progLang:String, algorithm: String ):Unit =
      println(s"[$name] Programming in $progLang using $algorithm")

  }
  val alice = Person("Alice")
  val bob = Person("Bob")

  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice greet bob)   // Works for methods that have exactly one argument - "Infix notation"

    println (alice likes "Alien")
    println (alice.?!(bob))
    println (alice ?! bob)

    alice.apply("Scala")
    alice("Scala")
    alice("Scala", "dynamic programming")
  }
}
