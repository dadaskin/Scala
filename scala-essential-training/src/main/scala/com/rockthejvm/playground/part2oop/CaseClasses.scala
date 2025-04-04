package com.rockthejvm.playground.part2oop

object CaseClasses {

  // Lightweight data structures

  case class Pet(name: String, age: Int) {
  }

  // 1. Class ctor args automatically promoted to fields
  val dino = new Pet("Dino", 2)
  val dinoAge = dino.age

  // 2. Case classes don't need new keyword.
  val dino2 = Pet("Dino", 2)

  // 3. toString() , equals(), hashCode() already set up.   Parent type: Any
  class PetSimple(name: String, age: Int)
  val dinoSimple = new PetSimple("Dino", 2)
  val dinoSimple2 = new PetSimple("Dino", 2)

  // 4. Utility methods
  val dinoYounger = dino.copy(age = 1)  // new instance of Pet with same data except as shown

  // 5. Companion objects automatically created with apply method with same signature as ctor.
  val dino3 = Pet("Dino", 2)

  // 6. Serializable

  // 7. Eligible for pattern matching  (later in course)

  // Case objects: Singleton case classes
  case object UnitedKingdom {
    def name:String = "the UK of ...."
  }

  // define hierarchies of storable data structures, some are singletons
  trait Message
  case class InitialInteraction(message: String) extends Message
  // ... and other classes

  case object EndConversation extends Message

  // Pattern matching
  // some external method
  def getMessage(): Message = InitialInteraction("hello")

  val message: Message = getMessage()
  val contents = message match {
    case InitialInteraction(someContent) => s"Received: $someContent"
    case EndConversation => "end of chat"
  }


  def main(args: Array[String]): Unit = {
    println(dinoSimple.toString)
    println(dino.toString)
    println(dinoSimple == dinoSimple2)
    println(dino == dino2)
    println(dinoYounger)
  }
}
