package com.rockthejvm.playground.part2oop

object OOBasics {

  class Person(val name:String, age: Int) {  // "val" causes constructor parameter to become a field also
    val allCaps = name.toUpperCase()   // Can also be var

    def greet(someone: String): String =
      s"$name says: Hi, $someone"

    // Overloaded method names allowed as long as signature has to be different.
    def greet(): String =
      s"Hi Everyone, I'm $name"
  }

  val daniel = new Person("Daniel", 99)
  val danielName = daniel.name    // Only possible because I used "val" in front of name in constructor

  /* Exercises
     1. Car registration app:
        - Create Car class and Driver class
        Car has make, model, releaseYear, owner:Driver, ownerAge(), isOwnedBy(Driver):Boolean, copy(newYearOfRelease): Car with new releaseYear
        Driver has firstName, lastName, birthYear, fullName()
   */
  class Driver (fName: String, lName:String, var birthYear: Int) {
    def fullName(): String = s"$fName $lName"
  }

  class Car(make:String, model: String, var releaseYear:Int, owner:Driver) {
    def ownerAge(): Int = releaseYear - owner.birthYear
    def isOwnedBy(driver:Driver): Boolean = {
      driver == owner
    }

    //      if ((owner.fullName() == driver.fullName()) && (ownerAge() == (releaseYear - driver.birthYear))) true
     //      else false
    def copy(newYearOfRelease: Int): Car = new Car(make, model, newYearOfRelease, owner)
  }

  val d1 = new Driver("Larry", "Brown", 1975)
  val d2 = new Driver("Evil", "Twin", 1990)
  val c1 = new Car("Hyundai", "Ionic", 2023, d1)
  val c2 = new Car("Toyota", "Prius", 2023, d2)

  def main(args: Array[String]): Unit = {
    println(d1.fullName())
    println(c1.ownerAge())
    println(d2.fullName())
    println(c2.ownerAge())

    println(c1.isOwnedBy(d1))
    println(c1.isOwnedBy(d2))

    println(c1.releaseYear)
    println(c1.copy(2025).ownerAge())

  }

}