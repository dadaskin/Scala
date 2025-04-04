package com.rockthejvm.playground.part3fp

object TuplesMapsDemo {

  // Tuples
  val aTuple: (Int, String) = (2, "foobar")
  val firstField = aTuple._1
  val secondField = aTuple._2

  // 2-element Tuples have some syntactic sugar:
  val aTuple2 = 2-> "foobar"  // Note the "thin arrow" operator

  // Maps: keys -> values.  keys are unique
  val phonebook = Map(
    "Jim" -> 555,
    "Dan" -> 921,
    "Jane" -> 123
  )

  val hasDan = phonebook.contains("Dan")
  val DanNumber = phonebook("Dan")   // May crash if key is not in the map!!!

  val newPair = "Mary" -> 678
  val newPhoneBook = phonebook + newPair

  val noDan = phonebook - "Dan"

  // lists of Tuples <-> Maps
  val listOfEntries = List (
    "Jim" -> 555,
    "Dan" -> 921,
    "Jane" -> 123
  )

  val phonebook2 = listOfEntries.toMap
  val listOfEntries2 = phonebook.toList

  val allNames = phonebook.keySet;
  val allNums = phonebook.values;
  val allNumsAsList = allNums.toList




  def main(args: Array[String]): Unit = {
    println(allNames)
    println(allNums)
    println(allNumsAsList)
  }
}
