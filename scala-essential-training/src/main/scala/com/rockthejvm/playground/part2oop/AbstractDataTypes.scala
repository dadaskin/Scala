package com.rockthejvm.playground.part2oop

object AbstractDataTypes {

  // Abstract Classes
  //  cannot be instantiated on their own
  //  derived classes must be abstract -or- have an implementation for each item.
  abstract class VideoGame {
     val gameType: String
     def play() : Unit

     // can provide definitions of some members
     def runningPlatform: String = "PS5"
  }

//  val vg:VideoGame = new VideoGame   // cannot instantiate on its own

 // This works
  class Shooter extends VideoGame{
    override val gameType: String = "FPS"
    override def play(): Unit = println("Fire!")
 }


  // Traits  (similar to Interfaces in C#)
 trait ThirdPerson {
    def showPerspective(game:VideoGame): Unit
  }

  // Traits can extend other traits
  trait OpenWorld extends ThirdPerson {
    def showPerspective(game:VideoGame): Unit =
      println ("open world perspective")
  }

  trait StoryLine {
    def mainCharacter: String
  }

  // A class can extend ONE class, but multiple traits.
  class MassEffect extends VideoGame with OpenWorld with StoryLine{
    override val gameType: String = "open-world story"
    override def play(): Unit = println("saving the galaxy")
    override def mainCharacter: String = "Commander Shepard"
  }

  def main(args: Array[String]): Unit = {
     val cs = new Shooter
     println(cs.runningPlatform)
  }
}
