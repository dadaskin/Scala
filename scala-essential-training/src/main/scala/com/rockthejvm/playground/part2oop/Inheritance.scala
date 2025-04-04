package com.rockthejvm.playground.part2oop

object Inheritance {

  class VideoGame {
    val gameType = "interactive"
    def play(): Unit = println("game running!")
  }

  // single class inheritance
  class Shooter extends VideoGame {
    def multiplayer(): Unit =  {
      play()
      println("boom")
    }
  }

  val crysis = new Shooter

  // Inherit primary constructor
  class Person(val name:String, age:Int)
  class Adult(name:String, age:Int) extends Person(name, age)  // Must specify constructor args

  val daniel = new Adult("Daniel", 99)

  // Overriding = provide a new implementation for methods in derived classes.
  class RPG extends VideoGame {
    override val gameType = "role-playing"
    override def play(): Unit = println("level up!")
  }

  // Subtype Polymorphism
  val wow: VideoGame = new RPG  // define a value of a parent type, provide an instance of a derived type

  // Anonymous classes
  val psychonauts = new VideoGame {
    override val gameType: String = "platformer"
  }
  /*
     Equivalent to:
     class AnonClass$3242 extends VideoGame {
       override val gameType = "platformer"
     }

    val psychonauts = new AnonClass$3242
  */


  def main(args: Array[String]): Unit = {
    println(crysis.gameType)
    crysis.multiplayer()
    println(wow.gameType)
    wow.play()
  }
}
