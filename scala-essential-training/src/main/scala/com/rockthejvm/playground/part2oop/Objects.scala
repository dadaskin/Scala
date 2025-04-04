package com.rockthejvm.playground.part2oop

object Objects {

  // Singleton pattern
  object MySingleton { // Defined MySingleton type and ONLY possible instance of it.
    val aField = 45
    def aMethod(x: Int) = x + 1
  }
  val theSingleton = MySingleton
  val anotherSingletong = MySingleton

  // Combination of class + object of the same name in the same file: "Companion"
  class Person(name:String) {
    def sayHi(): String = s"Hi my name is $name"
  }

  object Person {  // Companion object defines "static" fields and methods
    val nEyes = 2
    def canFly(): Boolean = false
  }

  // Objects can extend classes/traits
  object BigFoot extends Person("Big Foot")

  /* 
    Scala compiles to JVM bytcodes.
       JVM expects class with static void main(args[String])
   */
  
  def main(args: Array[String]): Unit = {
    println(theSingleton == anotherSingletong)
    println(MySingleton.aField)
    println(MySingleton.aMethod(4))
  }
}
